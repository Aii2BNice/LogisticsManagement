package com.neusoft.ddzx.zzdd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.ddzx.rwdcc.model.Task1;
import com.neusoft.ddzx.rwdcc.service.TaskService;
import com.neusoft.ddzx.sgdd.model.Order;
import com.neusoft.ddzx.sgdd.service.ManualDiaoDuService;
import com.neusoft.ddzx.zzdd.model.ZDAllocate;
import com.neusoft.ddzx.zzdd.service.OrderZdService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;
@Controller
public class Zddd {
	@Autowired
	private OrderZdService service;
	@Autowired ManualDiaoDuService service1;
	@Autowired TaskService service2;
	@Autowired
	private JournalService journalService;
	@RequestMapping("/orderzddd")
	public String orderZddd(HttpServletRequest req){
		String str="/ddzx/zddd/orderzddd.jsp";
		List<Order> list =service.queryByZd();
		req.setAttribute("list", list);
		return str;
	}
	@RequestMapping("/ajaxorderzddd")
	@ResponseBody
	public List<Order> ajax(HttpServletRequest req){
		
		List<Order> list =service.queryByZd();
		
		return list;
	}
	@RequestMapping("/zdadd")
	public String zdAdd(HttpServletRequest req,Integer id){
		int i=service1.update(id);
		Order o=service1.queryByOrderId(id);
		int i1=service.zdaddtask(o);
		Task1 t=service2.queryByOrderId(id);
		ZDAllocate zdal =new ZDAllocate(o.getOrderId(),t.getId(),o.getShopId(),o.getShopNum(),o.getSubstationId());
		int t2=service.addAllocate(zdal);
		req.setAttribute("msg", "订单号为"+id+"的订单已完成自动调度，已自动生成任务单和调拨单!");
		journalService.insert(new Journal(null,"qirx",o.getOrderId(),null,null,null,"自动调度"));
		return "/ddzx/zddd/orderzddd.jsp";
	}
}
