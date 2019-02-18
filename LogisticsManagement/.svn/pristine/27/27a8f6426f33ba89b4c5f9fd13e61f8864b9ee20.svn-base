package com.neusoft.ddzx.rwdcc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ddzx.rwdcc.model.Task1;
import com.neusoft.ddzx.rwdcc.service.TaskService;
/**
 * 根据id查询任务单 controller
 * @author new
 *
 */
@Controller
public class TaskController {
	@Autowired
	private TaskService service;
	@RequestMapping("/rwdcc")
	public String queryById(HttpServletRequest req,Task1 t1){
		req.setAttribute("msg", t1.getTaskStateId());
		req.setAttribute("msg1", t1.getTaskTypeId());
		List<Task1> list=service.queryByAll(t1);
		req.setAttribute("list", list);
		return "/ddzx/rwdcx/taskformquery.jsp";
	}
}
