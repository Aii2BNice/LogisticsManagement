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
 *ȱ������״̬�޸�Controller
 */
@Controller
public class Order1Controller {
	@Autowired
	private Order1Service service;
	
	@Autowired
	private JournalService journalService;
	
	/*
	 * ȫ��ȱ��������ѯ
	 */
	/*@RequestMapping("/queryallqh")
	public String queryAllQh(HttpServletRequest req){
		List<Order1> list=service.queryAllQh();
		req.setAttribute("list", list);
		return "/ddzx/qhddztxg/qhddcx.jsp";
	}*/
	/*
	 * ȱ�������޸�Ϊδ���Ͷ���
	 */
	@RequestMapping(value="/updateqh",params="orderId")
	public String updateQh(HttpServletRequest req,Integer orderId){
		int i=service.updateQh(orderId);
		System.out.println(orderId);
		System.out.println(i);
		if(i>0){
			List<IoAllocate> list=service.queryByYrk();
			req.setAttribute("list", list);
			journalService.insert(new Journal(null,"qirx",orderId,null,null,null,"����״̬�޸�"));
		}
		return "/ddzx/qhddztxg/qhddcx.jsp";
	}
	/*
	 * ȫ��ȱ��������ѯ
	 */
	@RequestMapping("/querybyyrk")
	public String queryByYrk(HttpServletRequest req){
		List<IoAllocate> list=service.queryByYrk();
		req.setAttribute("list", list);
		return "/ddzx/qhddztxg/qhddcx.jsp";
	}
}
