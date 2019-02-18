package com.neusoft.finance.invoicedj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.finance.invoicedj.model.InvoiceCXDJ;
import com.neusoft.finance.invoicedj.service.InvoiceDJService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

@Controller
public class InvoiceDJController {
	@Autowired
	private InvoiceDJService service;
	@Autowired
	private JournalService journalService;
	@RequestMapping("updatedj")
	public String updateDJ(HttpServletRequest req,Integer id){
		String str="";
		int i=service.updateDJ(id);
		if(i>0){
			req.setAttribute("msg", "��Ʊ��Ϊ"+id+"�ķ�Ʊ����ɵǼ�");
			System.out.println(req.getAttribute("msg"));
			str="/finance/invoicedj/invoicedj.jsp";
			List<InvoiceCXDJ> list=service.invoiceCXQBDJ();
			req.setAttribute("list", list);
			journalService.insert(new Journal(null,"qirx2",null,null,null,null,"��Ʊ�Ǽ�"));
		}
		
		return str;
	}
	@RequestMapping("invoicecxdj")
	public String invoiceCXDJ(HttpServletRequest req,InvoiceCXDJ in){
		List<InvoiceCXDJ> list=service.invoiceCXDJ(in);
		req.setAttribute("list", list);
		return "/finance/invoicedj/invoicedj.jsp";
	}
}
