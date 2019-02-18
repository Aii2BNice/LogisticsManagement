package com.neusoft.finance.invoicekehuly.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.finance.invoicekehuly.service.InvoiceKehuService;
import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.fzgl.deliverform.model.DeliverForm;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

@Controller
public class InvoiceKehuController {
	@Autowired
	private InvoiceKehuService service;
	@Autowired
	private JournalService journalService;
	@RequestMapping("invoicecxkehu")
	public String invoiceCXKehu(HttpServletRequest req,Invoice in){
		List<Invoice> list=service.invoiceCXKehu(in);
		req.setAttribute("list", list);
		return "/fzgl/invoice/invoicekehuly.jsp";
	}
	@RequestMapping("invoicecxkehubyid")
	public String invoiceCXKehuById(HttpServletRequest req,Invoice in){
		List<Invoice> list=service.invoiceCXKehu(in);
		req.getSession().setAttribute("invoicecxkehubyid", list);
		return "/fzgl/invoice/invoicekehulytx.jsp";
	}
//	�ͻ����÷�Ʊѡ������Ա�����񵥺��Զ���ʾ
	@RequestMapping(value="invoiceCXTaskId")
	@ResponseBody
	public String invoiceCXTaskId(HttpServletRequest req,@RequestBody DeliverForm d){
		System.out.println("--deliverId="+d.getDeliverId());
		String taskId=service.queryTaskIdByD(d.getDeliverId());
		System.out.println("--taskId="+taskId);
		
		return taskId;
	}
	
	@RequestMapping("updatekehu")
	public String updateKehu(HttpServletRequest req,Invoice in){
		String str="";
		int i=service.updateKehu(in);
		if(i>0){
		req.setAttribute("msg", "��Ʊ��Ϊ"+in.getId()+"�ķ�Ʊ����ɿͻ�����");
		str="/fzgl/invoice/invoicekehuly.jsp";
		List<Invoice> list=service.invoiceCXQBKehu();
		req.setAttribute("list", list);
		journalService.insert(new Journal(null,"qirx2",null,null,null,null,"��Ʊ�ͻ�����"));
		}
		return str;
	}
}