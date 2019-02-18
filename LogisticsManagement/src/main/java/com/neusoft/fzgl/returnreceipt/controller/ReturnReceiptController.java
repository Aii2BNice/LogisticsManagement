package com.neusoft.fzgl.returnreceipt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.fzgl.returnreceipt.model.ReturnReceipt;
import com.neusoft.fzgl.returnreceipt.service.ReturnReceiptService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;
/*
 * 回执录入
 */
@Controller
public class ReturnReceiptController {

	@Autowired
	private ReturnReceiptService service;
	
	@Autowired
	private JournalService journalService;
	
	//查询回执信息
	@RequestMapping("/queryReturnReceipt")
	public String queryReturnReceipt(HttpServletRequest req,ReturnReceipt rr){
		String str="/fzgl/returnreceipt/returnreceipt.jsp";
		List<ReturnReceipt> list = service.queryReturnReceipt(rr);
		req.setAttribute("list", list);
		return str;
	}
	
	//修改任务状态,查询配送员号根据配送员号修改配送员状态
	@RequestMapping("/updateTaskState")
	public String updateTaskState(HttpServletRequest req,ReturnReceipt rr){
		String str="/fzgl/returnreceipt/returnreceipt.jsp";
		//修改任务状态
		int i=service.updateTaskState(rr);
		
		int deliverFormId=rr.getDeliverFormId();
		//修改订单状态
		//查询任务状态号，如果为5,6（完成，部分完成）则订单状态为8（完成），如果为7（失败）则订单状态为9（失败）
		int taskStateId=service.queryTaskState(deliverFormId);
		if(taskStateId==5||taskStateId==6){
			rr.setOrderStateId(8);
			service.updateOrderState(rr);
			//增加日志
			journalService.insert(new Journal(null, "yuanjing", null, null, null, null, "修改订单状态为'完成'"));
		}
			
		if(taskStateId==7){
			rr.setOrderStateId(9);
			service.updateOrderState(rr);
			//增加日志
			journalService.insert(new Journal(null, "yuanjing", null, null, null, null, "修改订单状态为'失败'"));
		}
		
		service.updateOrderDeliverDate(rr);
		Integer deliverId=Integer.valueOf(service.queryDeliverId(deliverFormId));
		service.updateDeliverState(deliverId);
		req.setAttribute("i", i);
		req.setAttribute("dfID", rr.getDeliverFormId());
		return str;
	}
}

