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
 * Ȩ�����Controller
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
	 * ��ѯȨ��
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
	 * ����Ȩ��
	 * @param req
	 * @param power
	 * @return
	 */
	@RequestMapping("/insertpower")
	public String insertPower(HttpServletRequest req,Power power){
		String url = "/system/power/addpower.jsp";
		int count = service.insert(power);
		journalService.insert(new Journal(null, "su", null, null, null, null, "����Ȩ��"));
		if(count>0){
			req.setAttribute("msg", "Ȩ�����ӳɹ�");
		}else{
			req.setAttribute("msg", "Ȩ������ʧ��");
		}
		return url;
	}
	
	/**
	 * ת���޸�Ȩ����Ϣ����
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
	 * �޸�Ȩ����Ϣ
	 * @param req
	 * @param power
	 * @return
	 */
	@RequestMapping("/updatepower")
	public String updatePower(HttpServletRequest req,Power power){
		String url = "/system/power/querypower.jsp";
		int count = service.update(power);
		journalService.insert(new Journal(null, "su", null, null, null, null, "�޸�Ȩ��"));
		if(count>0){
			req.setAttribute("msg", "Ȩ���޸ĳɹ�");
		}else{
			req.setAttribute("msg", "Ȩ���޸�ʧ��");
		}
		return url;
	}
	
	/**
	 * ɾ��Ȩ��
	 * @param req
	 * @param powerid
	 * @return
	 */
	@RequestMapping(value="/deletepower",params="powerid")
	public String deletePower(HttpServletRequest req,Integer powerid){
		String url = "/system/power/querypower.jsp";
		int count = service.delete(powerid);
		journalService.insert(new Journal(null, "su", null, null, null, null, "ɾ��Ȩ��"));
		if(count>0){
			req.setAttribute("msg", "Ȩ��ɾ���ɹ�");
		}else{
			req.setAttribute("msg", "Ȩ��ɾ��ʧ��");
		}
		return url;
	}
	/**
	 * Ȩ������Ч����֤
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
			message.setMessage("Ȩ�����Ѵ���");
			req.setAttribute("message", message);
		}
		return message;
	}
}