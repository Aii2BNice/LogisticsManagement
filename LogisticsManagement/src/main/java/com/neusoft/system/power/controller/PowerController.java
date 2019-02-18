package com.neusoft.system.power.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;
import com.neusoft.system.power.model.Power;
import com.neusoft.system.power.service.PowerService;
import com.neusoft.system.user.model.Message;
/**
 * 权限相关Controller
 * @author DYQ
 *
 */
@Controller
public class PowerController {
	
	@Autowired
	private PowerService service;
	@Autowired
	private JournalService journalService;
	
	/**
	 * 查询权限
	 * @param req
	 * @param power
	 * @return
	 */
	@RequestMapping("/querypower")
	public String queryPower(HttpServletRequest req,Power power){
		String url = "/system/power/querypower.jsp";
		List<Power> powers = service.queryAll(power);
		if(powers!=null){
			req.setAttribute("powerid", power.getPowerid());
			req.setAttribute("powername", power.getPowername());
			req.getSession().setAttribute("powers", powers);
		}
		return url;
	}
	
	/**
	 * 增加权限
	 * @param req
	 * @param power
	 * @return
	 */
	@RequestMapping("/insertpower")
	public String insertPower(HttpServletRequest req,Power power){
		String url = "/system/power/addpower.jsp";
		int count = service.insert(power);
		journalService.insert(new Journal(null, "su", null, null, null, null, "增加权限"));
		if(count>0){
			req.setAttribute("msg", "权限增加成功");
		}else{
			req.setAttribute("msg", "权限增加失败");
		}
		return url;
	}
	
	/**
	 * 转到修改权限信息界面
	 * @param req
	 * @param act
	 * @return
	 */
	@RequestMapping(value="/updatepower",params="act")
	public String updateUser(HttpServletRequest req,String act){
		String url = "/system/power/updatepower.jsp";
		String[] values = act.split(",");
		req.setAttribute("powerid", values[0]);
		req.setAttribute("powername", values[1]);
		return url;
	}
	
	/**
	 * 修改权限信息
	 * @param req
	 * @param power
	 * @return
	 */
	@RequestMapping("/updatepower")
	public String updatePower(HttpServletRequest req,Power power){
		String url = "/system/power/querypower.jsp";
		int count = service.update(power);
		journalService.insert(new Journal(null, "su", null, null, null, null, "修改权限"));
		if(count>0){
			req.setAttribute("msg", "权限修改成功");
		}else{
			req.setAttribute("msg", "权限修改失败");
		}
		return url;
	}
	
	/**
	 * 删除权限
	 * @param req
	 * @param powerid
	 * @return
	 */
	@RequestMapping(value="/deletepower",params="powerid")
	public String deletePower(HttpServletRequest req,Integer powerid){
		String url = "/system/power/querypower.jsp";
		int count = service.delete(powerid);
		journalService.insert(new Journal(null, "su", null, null, null, null, "删除权限"));
		if(count>0){
			req.setAttribute("msg", "权限删除成功");
		}else{
			req.setAttribute("msg", "权限删除失败");
		}
		return url;
	}
	/**
	 * 权限名有效性验证
	 * @param req
	 * @param power
	 * @param message
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/verifictionpower")
	@ResponseBody
	public Message verifictionClient(HttpServletRequest req, 
			@RequestBody Power power, Message message) throws Exception {
		List<Power> powers = service.queryAll(power);
		if(powers.size()>0){
			message.setMessage("权限名已存在");
			req.setAttribute("message", message);
		}
		return message;
	}
}
