package com.neusoft.finance.invoicesubly.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ddzx.sgdd.model.Depot1;
import com.neusoft.ddzx.sgdd.service.ManualDiaoDuService;
import com.neusoft.finance.invoicesubly.model.InvoiceCXSub;
import com.neusoft.finance.invoicesubly.model.InvoiceSub;
import com.neusoft.finance.invoicesubly.service.InvoiceSubService;
import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

@Controller
public class InvoiceSubController {
	@Autowired
	private InvoiceSubService service;
	@Autowired
	private ManualDiaoDuService service1;
	@Autowired
	private JournalService journalService;
	@RequestMapping("invoicecxsubbyid")
	public String invoiceCXSubById(HttpServletRequest req,Invoice in){
		List<Invoice> list = service.invoiceCXSubBy(in);
		req.setAttribute("list", list);
		List<Depot1> depot=service1.queryDepot();
		req.setAttribute("depot", depot);
		return "/finance/invoicesubly/invoicesublytx.jsp";
	}
	@RequestMapping("invoicecxsubby")
	public String invoiceCXSubBy(HttpServletRequest req,Invoice in){
		List<Invoice> list = service.invoiceCXSubBy(in);
		req.setAttribute("list", list);
		return "/finance/invoicesubly/invoicesubly.jsp";
	}
	@RequestMapping("updately")
	public String updateLY(HttpServletRequest req,InvoiceSub sub){
		String str="";
		int i=service.updateLY(sub);
		if(i>0){
			req.setAttribute("msg", "发票号为"+sub.getId()+"的发票已完成分站领用");
			str="/finance/invoicesubly/invoicesubly.jsp";
			List<Invoice> list = service.invoiceCXSub();
			req.setAttribute("list", list);
			journalService.insert(new Journal(null,"qirx2",null,null,null,null,"发票分站领用"));
		}
		
		return str;
	}
}
