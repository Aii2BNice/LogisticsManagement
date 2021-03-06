package com.neusoft.finance.invoicesc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.finance.invoicesc.service.InvoiceSSService;
import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 生成发票单controller
 * @author new
 *
 */
@Controller
public class InvoiceSSController {
	@Autowired
	private InvoiceSSService service;
	@Autowired
	private JournalService journalService;
	@RequestMapping(value="invoicesc")
	public String addInvoice(HttpServletRequest req,Invoice invoice){
		String str="";
		if(invoice.getPrice()==50){
			int i=service.invoice50();
			if(i>0){
				req.setAttribute("msg", "已生成"+invoice.getPrice()+"元发票");
				str="/finance/invoicesc/invoicesc.jsp";
			}
		}
		if(invoice.getPrice()==100){
			int i=service.invoice100();
			if(i>0){
				req.setAttribute("msg", "已生成"+invoice.getPrice()+"元发票");
				str="/finance/invoicesc/invoicesc.jsp";
			}
		}
		if(invoice.getPrice()==200){
			int i=service.invoice200();
			if(i>0){
				req.setAttribute("msg", "已生成"+invoice.getPrice()+"元发票");
				str="/finance/invoicesc/invoicesc.jsp";
			}
		}
		if(invoice.getPrice()==500){
			int i=service.invoice500();
			if(i>0){
				req.setAttribute("msg", "已生成"+invoice.getPrice()+"元发票");
				str="/finance/invoicesc/invoicesc.jsp";
			}
		}
		if(invoice.getPrice()==1000){
			int i=service.invoice1000();
			if(i>0){
				req.setAttribute("msg", "已生成"+invoice.getPrice()+"元发票");
				str="/finance/invoicesc/invoicesc.jsp";
			}
		}
		journalService.insert(new Journal(null,"qirx2",null,null,null,null,"发票生成"));
		return str;
	}
	
}
