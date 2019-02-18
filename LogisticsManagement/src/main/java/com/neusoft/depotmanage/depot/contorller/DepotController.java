package com.neusoft.depotmanage.depot.contorller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.depotmanage.depot.model.Depot;
import com.neusoft.depotmanage.depot.service.DepotService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 库房信息管理controller
 * @author new
 *
 */
@Controller
public class DepotController {

	@Autowired
	private DepotService service;
	@Autowired
	private JournalService journalService;
	//查询所有方法
	@RequestMapping(value="/querydepot")
	public String queryAll(HttpServletRequest req,Depot d){
		String str = "/depotmanage/depot/querydepot.jsp";
		
		List<Depot> list = service.queryAll(d);
		req.setAttribute("list", list);
		
		return str;
	}
	//根据ID查询
	@RequestMapping(value="/queryById",params="depotId")
	public String queryById(HttpServletRequest req,Integer depotId){
		String str = "/depotmanage/depot/updatedepot.jsp";
		
		Depot d1 = service.queryById(depotId);
		req.setAttribute("list", d1);
		
		return str;
	}
	//修改库房信息
		@RequestMapping(value="/update")
		public String update(HttpServletRequest req,Depot d){
			String str = "/depotmanage/depot/updatedepot.jsp";
			journalService.insert(new Journal(null,"haoben",null, null, null, null, "修改库房信息"));
			int i = -1;
			i = service.update(d);
			if(i>0){
				str="/depotmanage/depot/querydepot.jsp";
				req.setAttribute("msg", "update--success");
			}else{
				req.setAttribute("msg", "update--fail");
			}
			
			return str;
		}
	//增加库房信息
	@RequestMapping(value="/add")
	public String add(HttpServletRequest req,Depot d){
		String str = "/depotmanage/depot/adddepot.jsp";
		journalService.insert(new Journal(null, "haoben", null, null, null, null, "增加库房信息"));
		int i = -1;
		i = service.add(d);
		if(i>0){
			str="/depotmanage/depot/querydepot.jsp";
			req.setAttribute("msg", "add--success");
		}else{
			req.setAttribute("msg", "add--fail");
		}
		
		return str;
	}
	//删除库房信息
	@RequestMapping(value="/delete",params="depotId")
	public String delete(HttpServletRequest req,Integer depotId){
		String str = "/depotmanage/depot/querydepot.jsp";
//		journalService.insert(new Journal(null, "haoben", null, null, null, null, "删除库房信息"));
		int i = -1;
		i = service.delete(depotId);
		if(i>0){
			req.setAttribute("msg", "delete--success");
			str="/depotmanage/depot/querydepot.jsp";
		}else{
			req.setAttribute("msg", "delete--fail");
		}
		
		return str;
	}
}
