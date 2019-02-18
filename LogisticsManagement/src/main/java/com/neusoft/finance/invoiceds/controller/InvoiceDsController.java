package com.neusoft.finance.invoiceds.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.finance.invoiceds.model.InvoiceDs;
import com.neusoft.finance.invoiceds.service.InvoiceDsService;
import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.finance.queryallinvoice.service.InvoiceService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

@Controller
public class InvoiceDsController {
	@Autowired
	private InvoiceDsService service;
	@Autowired
	private InvoiceService service1;
	@Autowired
	private JournalService journalService;
	@RequestMapping("invoiceds")
	public String invoiceDs(HttpServletRequest req,InvoiceDs ds){
		int i=service.invoiceDs(ds);
		if(i>0){
			Invoice in=new Invoice();
			
			
			req.setAttribute("msg", "��Ʊ��Ϊ"+ds.getId()+"�ŵķ�Ʊ״̬���޸�Ϊ��ʧ��");
			journalService.insert(new Journal(null,"qirx2",null,null,null,null,"��Ʊ��ʧ"));
		}
		return "queryallpageinvoice.action";
	}
	@RequestMapping("invoicedsbyid")
	public String invoiceDsById(HttpServletRequest req,Integer id){
		int i = service.invoiceCXDS(id);
		req.setAttribute("i", i);
		return "/finance/invoiceds/invoiceds.jsp";
	}
	
}
