package com.neusoft.ddzx.qhddztxg.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ddzx.qhddztxg.service.Order1Service;
import com.neusoft.pszxgl.ioallocate.model.IoAllocate;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;


/**
 * @author new
 *缺货订单状态修改Controller
 */
@Controller
public class Order1Controller {
	@Autowired
	private Order1Service service;
	
	@Autowired
	private JournalService journalService;
	
	/*
	 * 全部缺货订单查询
	 */
	/*@RequestMapping("/queryallqh")
	public String queryAllQh(HttpServletRequest req){
		List<Order1> list=service.queryAllQh();
		req.setAttribute("list", list);
		return "/ddzx/qhddztxg/qhddcx.jsp";
	}*/
	/*
	 * 缺货订单修改为未配送订单
	 */
	@RequestMapping(value="/updateqh",params="orderId")
	public String updateQh(HttpServletRequest req,Integer orderId){
		int i=service.updateQh(orderId);
		System.out.println(orderId);
		System.out.println(i);
		if(i>0){
			List<IoAllocate> list=service.queryByYrk();
			req.setAttribute("list", list);
			journalService.insert(new Journal(null,"qirx",orderId,null,null,null,"订单状态修改"));
		}
		return "/ddzx/qhddztxg/qhddcx.jsp";
	}
	/*
	 * 全部缺货订单查询
	 */
	@RequestMapping("/querybyyrk")
	public String queryByYrk(HttpServletRequest req){
		List<IoAllocate> list=service.queryByYrk();
		req.setAttribute("list", list);
		return "/ddzx/qhddztxg/qhddcx.jsp";
	}
}
