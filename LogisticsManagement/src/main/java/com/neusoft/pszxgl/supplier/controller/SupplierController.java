package com.neusoft.pszxgl.supplier.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.pszxgl.supplier.model.Supplier;
import com.neusoft.pszxgl.supplier.service.SupplierService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;


/**
 * 供应商管理Controller
 */
@Controller
public class SupplierController {
	
	@Autowired
	private SupplierService service;
	
	@Autowired
	private JournalService journalService;
	
	/**
	 * 查询-有分页功能
	 * @param req
	 * @param u
	 * @return
	 */
	@RequestMapping(value="/suppage", params="act=query")
	public String querypage(HttpServletRequest req, Supplier su){
		String str = "/pszxgl/supplier/supplierquery.jsp";
		
		//获取一共有多少条记录
		int counts = service.queryCounts(su);
		
		//进行分页相关数据的计算-begin
		int pageNum = su.getPageNum();//当前第几页
		int pageCounts = su.getPageCounts();//每页多少条
		int pages = counts/pageCounts + (counts%pageCounts>0?1:0);//一共多少页
		if(pageNum<1){
			pageNum = 1;
		}
		if(pageNum>pages){
			pageNum = pages;
		}
		su.setPageNum(pageNum);
		su.setPageCounts(pageCounts);
		su.setPages(pages);
		su.setCounts(counts);
		//进行分页相关数据的计算-end
		
		//获取指定页的数据
		List<Supplier> list = service.queryAllPage(su);
		System.out.println("xxxxxxxxxxxxxxxxxxxx"+list);
		
		req.getSession().setAttribute("suplist", list);

		return str;
	}
	
	
	
	/**
	 * 查询全部数据
	 * @param request 请求对象
	 * @param pco 封装前台提交的请求参数
	 * @return 返回URL
	 */
	@RequestMapping(value="/querySupplier",params="act=query")
	public String query(HttpServletRequest request,Supplier su){
		String str = "/pszxgl/supplier/supplierquery.jsp";
		List<Supplier> list = service.queryAll(su);
		request.getSession().setAttribute("suplist", list);
		return str;
	}
	
	
	/**
	 * 通过ID查询一条数据
	 * @param request 请求对象
	 * @param pco 封装前台提交的请求参数
	 * @return 返回URL
	 */
	@RequestMapping(value="/toUpdateSupplier",params="act=toUpdate")
	public String toUpdate(HttpServletRequest request,Supplier su){
		String str = "/pszxgl/supplier/supplierupdate.jsp";
		Supplier sup = service.queryById(su.getId());
		request.getSession().setAttribute("sup", sup);
		return str;
	}
	
	
	/**
	 * 增加一条数据
	 * @param request 请求对象
	 * @param pco 封装前台提交的请求参数
	 * @return 返回URL
	 */
	@RequestMapping(value="/addSupplier",params="act=add")
	public String add(HttpServletRequest request,Supplier su){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "增加"+su.getId()+"供应商信息"));
		String str = "/pszxgl/supplier/supplierquery.jsp";
		int i = service.add(su);
		if(i>0){
			request.setAttribute("msg", "增加成功！");
		}else {
			request.setAttribute("msg", "增加失败！");
		}
		return str;
	}
	
	/**
	 * 修改一条数据
	 * @param request 请求对象
	 * @param pco 封装前台提交的请求参数
	 * @return 返回URL
	 */
	@RequestMapping(value="/updateSupplier",params="act=update")
	public String update(HttpServletRequest request,Supplier su){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "修改"+su.getId()+"供应商信息"));
		String str = "/pszxgl/supplier/supplierquery.jsp";
		int i = service.update(su);
		if(i>0){
			request.setAttribute("msg", "修改成功！");
		}else {
			request.setAttribute("msg", "修改失败！");
		}
		return str;
	}
	
	
	/**
	 * 通过ID删除一条数据
	 * @param request 请求对象
	 * @param pco 封装前台提交的请求参数
	 * @return 返回URL
	 */
	@RequestMapping(value="/deleteSupplier",params="act=delete")
	public String delete(HttpServletRequest request,Supplier su){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "删除"+su.getId()+"供应商信息"));
		String str = "/pszxgl/supplier/supplierquery.jsp";
		int i = service.delete(su.getId());
		if(i>0){
			request.setAttribute("msg", "删除成功！");
		}else {
			request.setAttribute("msg", "删除失败！");
		}
		return str;
	}
	
}
