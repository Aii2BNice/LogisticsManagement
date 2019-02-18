package com.neusoft.fzgl.deliverform.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.fzgl.deliverform.model.DeliverForm;
import com.neusoft.fzgl.deliverform.service.DeliverFormService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 配送签收单Controller 修改任务单状态、 配送员状态； 查询配送签收单、打印单
 * 
 * @author new
 *
 */
@Controller
public class DeliverFormController {

	@Autowired
	private DeliverFormService service;
	
	@Autowired
	private JournalService journalService;

	@RequestMapping(value = "/addUpdate", params = "value")
	public String addUpdate(HttpServletRequest req, String value) {
		String str = "/fzgl/taskoperation/deliver.jsp";
		//将字符串值拆分成数组存储
		String val[] = value.split(",");
//		增加日志
		journalService.insert(new Journal(null, "yuanjing", null, null, null, null, "修改订单状态为'已分配'"));
		if (val.length != 0) {
			//分别获取每一个值
			Integer deliverId = Integer.valueOf(val[0]);
			String deliverName = val[1];
			/* String taskFormState=val[2]; */
			Integer taskId = Integer.valueOf(val[3]);
			DeliverForm df = new DeliverForm();
			//存入对象
			df.setDeliverId(deliverId);
			df.setDeliverName(deliverName);
			df.setTaskId(taskId);
			//生成配送签收单
			service.addDeliver(df);
			//修改任务状态(任务已分配)
			service.updateTFS(taskId);
			//修改订单状态(任务已分配)
			service.updateOFS(taskId);
			//修改配送员状态
			service.updateDeliverState(deliverId);
			str = "/fzgl/taskoperation/deliverform.jsp";

		}

		return str;
	}
//查询配送签收单
	@RequestMapping(value = "/queryDeliverForm")
	public String queryDeliverForm(HttpServletRequest req) {
		String str = "/fzgl/taskoperation/deliverform.jsp";
		List<DeliverForm> list = service.queryDeliverForm();
		req.setAttribute("DeliverForm", list);
		return str;
	}
	
//	多表查询给打印单传值
	@RequestMapping(value = "/queryPrintForm")
	public String queryPrintForm(HttpServletRequest req,Integer deliverFormId) {
		String str = "/fzgl/taskoperation/deliverform.jsp";
		if(deliverFormId!=null){
//			增加日志
			journalService.insert(new Journal(null, "yuanjing",null , null, null, null, "打印商品配送签收单"));
			//查询打印单
			DeliverForm df2=service.queryPrintForm(deliverFormId);
			req.setAttribute("df", df2);
			//打印次数方法
			Integer printNum=df2.getPrintNum();
			printNum++;
			df2.setPrintNum(printNum);
			service.updatePrintNum(df2);
			str="/fzgl/taskoperation/printform.jsp";
		}
		return str;
	}
}
