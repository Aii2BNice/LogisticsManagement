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
 * ����ǩ�յ�Controller �޸�����״̬�� ����Ա״̬�� ��ѯ����ǩ�յ�����ӡ��
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
		//���ַ���ֵ��ֳ�����洢
		String val[] = value.split(",");
//		������־
		journalService.insert(new Journal(null, "yuanjing", null, null, null, null, "�޸Ķ���״̬Ϊ'�ѷ���'"));
		if (val.length != 0) {
			//�ֱ��ȡÿһ��ֵ
			Integer deliverId = Integer.valueOf(val[0]);
			String deliverName = val[1];
			/* String taskFormState=val[2]; */
			Integer taskId = Integer.valueOf(val[3]);
			DeliverForm df = new DeliverForm();
			//�������
			df.setDeliverId(deliverId);
			df.setDeliverName(deliverName);
			df.setTaskId(taskId);
			//��������ǩ�յ�
			service.addDeliver(df);
			//�޸�����״̬(�����ѷ���)
			service.updateTFS(taskId);
			//�޸Ķ���״̬(�����ѷ���)
			service.updateOFS(taskId);
			//�޸�����Ա״̬
			service.updateDeliverState(deliverId);
			str = "/fzgl/taskoperation/deliverform.jsp";

		}

		return str;
	}
//��ѯ����ǩ�յ�
	@RequestMapping(value = "/queryDeliverForm")
	public String queryDeliverForm(HttpServletRequest req) {
		String str = "/fzgl/taskoperation/deliverform.jsp";
		List<DeliverForm> list = service.queryDeliverForm();
		req.setAttribute("DeliverForm", list);
		return str;
	}
	
//	�����ѯ����ӡ����ֵ
	@RequestMapping(value = "/queryPrintForm")
	public String queryPrintForm(HttpServletRequest req,Integer deliverFormId) {
		String str = "/fzgl/taskoperation/deliverform.jsp";
		if(deliverFormId!=null){
//			������־
			journalService.insert(new Journal(null, "yuanjing",null , null, null, null, "��ӡ��Ʒ����ǩ�յ�"));
			//��ѯ��ӡ��
			DeliverForm df2=service.queryPrintForm(deliverFormId);
			req.setAttribute("df", df2);
			//��ӡ��������
			Integer printNum=df2.getPrintNum();
			printNum++;
			df2.setPrintNum(printNum);
			service.updatePrintNum(df2);
			str="/fzgl/taskoperation/printform.jsp";
		}
		return str;
	}
}