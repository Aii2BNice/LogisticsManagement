package com.neusoft.fzgl.taskform.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.fzgl.taskform.model.TaskForm;
import com.neusoft.fzgl.taskform.service.TaskFormService;

/**
 * 任务单Controller
 * @author new
 *
 */
@Controller
public class TaskFormController {
	
	@Autowired
	private TaskFormService service;
	
	@RequestMapping(value="/taskformquery",params="act=querytf")
	public String query(HttpServletRequest req,TaskForm tf){
		String str="/fzgl/taskform/taskformquery.jsp";
//		查询一共有多少条记录
		int counts = service.queryCounts(tf);
		System.out.println("counts="+counts);
// 进行分页相关数据的计算-begin
		int pageNum = tf.getPageNum();// 当前第几页
		int pageCounts = tf.getPageCounts();// 每页多少条
		int pages = counts / pageCounts + (counts % pageCounts > 0 ? 1 : 0);// 一共多少页
		if (pageNum < 1) {
			pageNum = 1;
		}
		if (pageNum > pages) {
			pageNum = pages;
		}
		tf.setPageNum(pageNum);
		tf.setPageCounts(pageCounts);
		tf.setPages(pages);
		tf.setCounts(counts);
//		 进行分页相关数据的计算-end
//		 获取指定页的数据

		List<TaskForm> list = service.queryAll(tf);
		req.setAttribute("list", list);
//		req.setAttribute("incomeTypeOptions", getIncomeTypeOptions(tf.getIncomeType().getTypeId()));
//		req.setAttribute("earnerOptions", getEarnerOptions(tf.getUser().getUserId()));

		return str;
	}
	@RequestMapping("/taskformqueryById")
	public String queryById(HttpServletRequest req,Integer id){
		String str="/fzgl/taskform/detail.jsp";
		TaskForm tf = service.queryById(id);
		req.setAttribute("tf", tf);
		return str;
	}
	
	//与上面方法相同，使用返回值是ModelAndView方式
//	@RequestMapping("/taskformqueryById")
//	public ModelAndView queryById(HttpServletRequest req,Integer id){
//		ModelAndView mav=new ModelAndView();
//		TaskForm tf = service.queryById(id);
//		mav.addObject("tf",tf);
//		mav.setViewName("detail");
//		return mav;
//	}

}
