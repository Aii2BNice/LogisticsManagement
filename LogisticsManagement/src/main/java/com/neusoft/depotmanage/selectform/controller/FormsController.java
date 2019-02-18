package com.neusoft.depotmanage.selectform.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neusoft.ddzx.sgdd.model.Task;
import com.neusoft.depotmanage.selectform.model.AllocateForm;
import com.neusoft.depotmanage.selectform.model.IoAllocateForm;
import com.neusoft.depotmanage.selectform.model.IoDepotForm;
import com.neusoft.depotmanage.selectform.service.FormsService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 查询表单管理Controller
 * @author new
 *
 */
@Controller
public class FormsController {

	@Autowired
	private FormsService service;
	@Autowired
	private JournalService journalService;
	/*查询调拨单表信息*/
	@RequestMapping(value="/queryAform",params="selectforms")
	public String queryAform(HttpServletRequest req,AllocateForm a,IoAllocateForm i,IoDepotForm d,Integer selectforms){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		if(selectforms.equals(1)){
			List<AllocateForm> list1 = service.queryAform(a);
			req.setAttribute("list1", list1);
			req.setAttribute("selectforms", selectforms);
		}else if(selectforms.equals(2)){
			List<IoAllocateForm> list2 = service.queryIoAform(i);
			req.setAttribute("list2", list2);
			req.setAttribute("selectforms", selectforms);
		}else if(selectforms.equals(3)){
			List<IoDepotForm> list3 = service.queryIoDform(d);
			req.setAttribute("list3", list3);
			req.setAttribute("selectforms", selectforms);
		}else{
			req.setAttribute("msg", "查询单据出错啦！");
		}
		
		return str;
	}
	/*查询购货出入库调拨单表信息
	@RequestMapping("/queryIoAform")
	public String queryIoAform(HttpServletRequest req,IoAllocateForm i){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		List<IoAllocateForm> list2 = service.queryIoAform(i);
		req.setAttribute("list2", list2);
		return str;
	}*/
	/*查询购货入库调拨单表信息*/
	@RequestMapping("/queryInAform")
	public String queryInAform(HttpServletRequest req,IoAllocateForm i){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		List<IoAllocateForm> list21 = service.queryInAform(i);
		req.removeAttribute("list2");
		req.setAttribute("list21", list21);
		return str;
	}
	/*查询退货出库调拨单表信息*/
	@RequestMapping("/queryOutAform")
	public String queryOutAform(HttpServletRequest req,IoAllocateForm i){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		List<IoAllocateForm> list22 = service.queryOutAform(i);
		req.setAttribute("list22", list22);
		return str;
	}
	/*
	 * 进货操作
	 */
	@RequestMapping(value="gouHuo")
	public String gouHuo(HttpServletRequest req,IoAllocateForm i){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		journalService.insert(new Journal(null, "haoben", null, null, null, null, "购货入库"));
		int x = service.gouHuo(i);
		int y = service.updateType1(i);
		int z = service.addIodepot3(i);
		if(x>0&&y>0&&z>0){
			str = "/depotmanage/selectforms/success.jsp";
			req.setAttribute("msg", "购货入库成功");
		}else{
			req.setAttribute("msg", "购货入库失败");
		}
		return str;
	}
	/*
	 * 退货操作
	 */
	@RequestMapping(value="tuiHuo")
	public String tuiHuo(HttpServletRequest req,IoAllocateForm i){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		journalService.insert(new Journal(null, "haoben",null,null,null,null,"退货出库"));
		int x = service.tuiHuo(i);
		int y = service.updateType2(i);
		int z = service.addIodepot4(i);
		if(x>0&&y>0&&z>0){
			str = "/depotmanage/selectforms/success.jsp";
			req.setAttribute("msg", "退货出库成功");
		}else{
			req.setAttribute("msg", "退货出库失败");
		}
		return str;
	}
	
	
	/*查询购货出入库调拨单表信息*/
	@RequestMapping("/queryIoDform")
	public String queryioDform(HttpServletRequest req,IoDepotForm d){
		String str = "/depotmanage/selectforms/queryforms.jsp";
		List<IoDepotForm> list3 = service.queryIoDform(d);
		req.setAttribute("list3", list3);
		return str;
	}
	
	/*
	 * 调拨单出入库操作
	 */
	@RequestMapping(value="/inOutDepot")
	public String inOutDepot(HttpServletRequest req,AllocateForm a,Task t){
		String str = "/depotmanage/selectforms/success.jsp";
		System.out.println("--a=" + a);
		int i = service.addStock(a);
		int j = service.deleteStock(a);
		int x = service.updateState(a);
		int y = service.addIodepot1(a);
		int z = service.addIodepot2(a);
		if(a.getDepotInId()==null){
			service.updaterenwudan(t);
		}
		if(i>0&&j>0&&x>0&&y>0&&z>0){
			str="/depotmanage/selectforms/queryforms.jsp";
			req.setAttribute("msg", "入库成功");
		}else{
			str = "/depotmanage/selectforms/queryforms.jsp";
			req.setAttribute("msg", "出入库失败");
		}
		return str;
	}
}
