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
 * ����Controller
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
//		��ѯһ���ж�������¼
		int counts = service.queryCounts(tf);
		System.out.println("counts="+counts);
// ���з�ҳ������ݵļ���-begin
		int pageNum = tf.getPageNum();// ��ǰ�ڼ�ҳ
		int pageCounts = tf.getPageCounts();// ÿҳ������
		int pages = counts / pageCounts + (counts % pageCounts > 0 ? 1 : 0);// һ������ҳ
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
//		 ���з�ҳ������ݵļ���-end
//		 ��ȡָ��ҳ������

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
	
	//�����淽����ͬ��ʹ�÷���ֵ��ModelAndView��ʽ
//	@RequestMapping("/taskformqueryById")
//	public ModelAndView queryById(HttpServletRequest req,Integer id){
//		ModelAndView mav=new ModelAndView();
//		TaskForm tf = service.queryById(id);
//		mav.addObject("tf",tf);
//		mav.setViewName("detail");
//		return mav;
//	}

}
