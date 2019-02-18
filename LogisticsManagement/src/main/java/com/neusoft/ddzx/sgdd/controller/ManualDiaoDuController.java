package com.neusoft.ddzx.sgdd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ddzx.sgdd.model.Allocate;
import com.neusoft.ddzx.sgdd.model.Depot1;
import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.model.Task;
import com.neusoft.ddzx.sgdd.service.ManualDiaoDuService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 手工调度 controller
 * @author new
 *
 */
@Controller
public class ManualDiaoDuController {
	@Autowired
	private ManualDiaoDuService service;
	@Autowired
	private JournalService journalService;
	//根据订单状态查询订单
	@RequestMapping("/orderformquerybystateid")
	public String queryByStateId(HttpServletRequest req,Order o){
		List<Order> list=service.queryByStateId(o);
		System.out.println(o.getOrderStateId());
		req.setAttribute("msg", o.getOrderStateId());
		req.setAttribute("msg1", o.getOrderTypeId());
		req.setAttribute("list", list);
		return "/ddzx/sgdd/orderformquerybystateid.jsp";
	}
	//根据订单号查询订单
	@RequestMapping("/orderformquerybyorderid")
	public String queryByOrderId(HttpServletRequest req,Integer orderId){
		Order o=service.queryByOrderId(orderId);
		req.setAttribute("o", o);
		return "/ddzx/sgdd/orderformquerybyorderid.jsp";
	}
	//根据订单号查询订单2
	@RequestMapping("/orderformquerybyorderid2")
	public String queryByOrderId2(HttpServletRequest req,Integer orderId){
		Order o=service.queryByOrderId(orderId);
		req.setAttribute("o", o);
		return "/ddzx/sgdd/diaodu.jsp";
	}
	//根据订单号查询订单3
	@RequestMapping("/roderformquerybyorderid3")
	public String queryByOrderId3(HttpServletRequest req,Integer orderId){
		Order o=service.queryByOrderId(orderId);
		req.setAttribute("o", o);
		List<Depot1> depot=service.queryDepot();
		req.setAttribute("depot", depot);
		return "/ddzx/sgdd/scrwd.jsp";
	}
	//根据订单号查询订单4
	@RequestMapping("/roderformquerybyorderid4")
	public String queryByOrderId4(HttpServletRequest req,Integer orderId){
		Order o=service.queryByOrderId(orderId);
		req.setAttribute("o", o);
		Integer taskId=service.queryTaskByOrderId(orderId);
		req.setAttribute("taskId", taskId);
		List<Depot1> depot=service.queryDepot();
		req.setAttribute("depot", depot);
		return "/ddzx/sgdd/scdbd.jsp";
	}
	//修改订单状态为已配送
	@RequestMapping("/diaodutj")
	public String renew(HttpServletRequest req,
			            Integer orderId){
		int i=service.update(orderId);
		if(i>0){
			Order o=service.queryByOrderId(orderId);
			req.setAttribute("o", o);
			service.updateTaskState(orderId);
			req.getSession().setAttribute("dddsc", "已提交");
			journalService.insert(new Journal(null,"qirx",orderId,null,null,null,"订单状态修改"));
		}
		return "/ddzx/sgdd/diaodu.jsp";
	}
	//增加调拨单
	@RequestMapping("/scallocate")
	public String addAllocate(HttpServletRequest req,Allocate a){
		String str="";
		int i=service.add(a);
		if(i>0){
			Order o=service.queryByOrderId(a.getOrderId());
			req.setAttribute("o", o);
			req.getSession().setAttribute("scdbd", "已生成");
			str="/ddzx/sgdd/diaodu.jsp";
			journalService.insert(new Journal(null,"qirx",null,null,null,null,"增加调拨单"));
		}
		return str;
	}
	//增加任务单
	@RequestMapping("/sctask")
	public String addTask(HttpServletRequest req,Task t){
		String str="";
		int i=service.add(t);
		if(i>0){
			Order o=service.queryByOrderId(t.getOrderId());
			req.setAttribute("o", o);
			req.getSession().setAttribute("scrwd", "已生成");
			str="/ddzx/sgdd/diaodu.jsp";
			journalService.insert(new Journal(null,"qirx",null,null,null,null,"增加任务单"));
		}
		return str;
	}
	
	
}
