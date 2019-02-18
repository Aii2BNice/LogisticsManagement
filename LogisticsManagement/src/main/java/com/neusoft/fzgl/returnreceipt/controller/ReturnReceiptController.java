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
 * ��ִ¼��
 */
@Controller
public class ReturnReceiptController {

	@Autowired
	private ReturnReceiptService service;
	
	@Autowired
	private JournalService journalService;
	
	//��ѯ��ִ��Ϣ
	@RequestMapping("/queryReturnReceipt")
	public String queryReturnReceipt(HttpServletRequest req,ReturnReceipt rr){
		String str="/fzgl/returnreceipt/returnreceipt.jsp";
		List<ReturnReceipt> list = service.queryReturnReceipt(rr);
		req.setAttribute("list", list);
		return str;
	}
	
	//�޸�����״̬,��ѯ����Ա�Ÿ�������Ա���޸�����Ա״̬
	@RequestMapping("/updateTaskState")
	public String updateTaskState(HttpServletRequest req,ReturnReceipt rr){
		String str="/fzgl/returnreceipt/returnreceipt.jsp";
		//�޸�����״̬
		int i=service.updateTaskState(rr);
		
		int deliverFormId=rr.getDeliverFormId();
		//�޸Ķ���״̬
		//��ѯ����״̬�ţ����Ϊ5,6����ɣ�������ɣ��򶩵�״̬Ϊ8����ɣ������Ϊ7��ʧ�ܣ��򶩵�״̬Ϊ9��ʧ�ܣ�
		int taskStateId=service.queryTaskState(deliverFormId);
		if(taskStateId==5||taskStateId==6){
			rr.setOrderStateId(8);
			service.updateOrderState(rr);
			//������־
			journalService.insert(new Journal(null, "yuanjing", null, null, null, null, "�޸Ķ���״̬Ϊ'���'"));
		}
			
		if(taskStateId==7){
			rr.setOrderStateId(9);
			service.updateOrderState(rr);
			//������־
			journalService.insert(new Journal(null, "yuanjing", null, null, null, null, "�޸Ķ���״̬Ϊ'ʧ��'"));
		}
		
		service.updateOrderDeliverDate(rr);
		Integer deliverId=Integer.valueOf(service.queryDeliverId(deliverFormId));
		service.updateDeliverState(deliverId);
		req.setAttribute("i", i);
		req.setAttribute("dfID", rr.getDeliverFormId());
		return str;
	}
}

