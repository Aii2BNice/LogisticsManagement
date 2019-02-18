package com.neusoft.fzgl.querypayment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.fzgl.querypayment.model.QueryPayment;
import com.neusoft.fzgl.querypayment.service.QueryPaymentService;
/*
 * ½É¿î²éÑ¯
 */
@Controller
public class QueryPaymentController {
	
	@Autowired
	private QueryPaymentService service;
	
	@RequestMapping("/queryPayment")
	public String queryPayment(HttpServletRequest req,QueryPayment qp){
		String str="/fzgl/querypayment/querypayment.jsp";
		List<QueryPayment> list = service.queryPayment(qp);
		req.setAttribute("list", list);
		return str;
	}

}
