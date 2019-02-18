package com.neusoft.pszxgl.productclassone.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclassone.service.ProductClassOneService;
import com.neusoft.pszxgl.supplier.model.Supplier;
import com.neusoft.pszxgl.supplier.service.SupplierService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 鍟嗗搧涓�绾у垎绫荤鐞咰ontroller
 */
@Controller
public class ProductClassOneController {
	
	@Autowired
	private ProductClassOneService service;
	
	@Autowired
	private JournalService journalService;
	
//begin 鑱斿姩-----------------------------------------	-----------------
	
	@Autowired
	private SupplierService supService;
	
	@RequestMapping(value="/ajaxquerypco")
	public String ajaxquerypco(HttpServletRequest request,ProductClassOne pco,
			@RequestParam("key") Integer key){
		String str ="";
		List<ProductClassOne> list = service.queryAll(pco);
		List<Supplier> suplist = supService.queryAll(null);
		if(key==1){
			str ="/pszxgl/productclasstwo/productclasstwoquery.jsp";
			request.getSession().setAttribute("listpcopco", list);
		}else if(key==2){
			str ="/pszxgl/productclasstwo/productclasstwoadd.jsp";
			request.getSession().setAttribute("listpcopco2", list);
		}else if(key==3){
			str ="/pszxgl/product/productquery.jsp";
			request.getSession().setAttribute("apcolist1", list);
			request.getSession().setAttribute("asuplist1", suplist);
		}else {
			str ="/pszxgl/product/productadd.jsp";
			request.getSession().setAttribute("apcolist2", list);
			request.getSession().setAttribute("asuplist2", suplist);
		}
		return str;
	}

//end 鑱斿姩-----------------------------------------	-----------------	

	/**
	 * 鏌ヨ-鏈夊垎椤靛姛鑳�
	 * @param req
	 * @param u
	 * @return
	 */
	@RequestMapping(value="/propage", params="act=query")
	public String querypage(HttpServletRequest req, ProductClassOne pco){
		String str = "/pszxgl/productclassone/productclassonequery.jsp";
		
		//鑾峰彇涓�鍏辨湁澶氬皯鏉¤褰�
		int counts = service.queryCounts(pco);
		
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-begin
		int pageNum = pco.getPageNum();//褰撳墠绗嚑椤�
		int pageCounts = pco.getPageCounts();//姣忛〉澶氬皯鏉�
		int pages = counts/pageCounts + (counts%pageCounts>0?1:0);//涓�鍏卞灏戦〉
		if(pageNum<1){
			pageNum = 1;
		}
		if(pageNum>pages){
			pageNum = pages;
		}
		pco.setPageNum(pageNum);
		pco.setPageCounts(pageCounts);
		pco.setPages(pages);
		pco.setCounts(counts);
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-end
		
		//鑾峰彇鎸囧畾椤电殑鏁版嵁
		List<ProductClassOne> list = service.queryAllPage(pco);
		System.out.println("xxxxxxxxxxxxxxxxxxxx"+list);
		
		req.getSession().setAttribute("pcolist", list);

		return str;
	}

	
	
	/**
	 * 鏌ヨ鍏ㄩ儴鏁版嵁
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/queryPCO",params="act=query")
	public String query(HttpServletRequest request,ProductClassOne pco){
		String str = "/pszxgl/productclassone/productclassonequery.jsp";
		List<ProductClassOne> list = service.queryAll(pco);
		request.getSession().setAttribute("list", list);
		return str;
	}
	
	
	/**
	 * 閫氳繃ID鏌ヨ涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/toUpdatePCO",params="act=toUpdate")
	public String toUpdate(HttpServletRequest request,ProductClassOne pco){
		String str = "/pszxgl/productclassone/productclassoneupdate.jsp";
		ProductClassOne proC = service.queryById(pco.getId());
		request.getSession().setAttribute("proC", proC);
		return str;
	}
	
	
	/**
	 * 澧炲姞涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/addPCO",params="act=add")
	public String add(HttpServletRequest request,ProductClassOne pco){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "增加"+pco.getId()+"商品一级分类信息"));
		String str = "/pszxgl/productclassone/productclassonequery.jsp";
		int i = service.add(pco);
		if(i>0){
			request.setAttribute("msg", "增加成功，请重新查询！");
		}else {
			request.setAttribute("msg", "增加失败，请重新查询！");
		}
		return str;
	}
	
	/**
	 * 淇敼涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/updatePCO",params="act=update")
	public String update(HttpServletRequest request,ProductClassOne pco){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "修改"+pco.getId()+"商品一级分类信息"));
		String str = "/pszxgl/productclassone/productclassonequery.jsp";
		int i = service.update(pco);
		if(i>0){
			request.setAttribute("msg", "修改成功，请重新查询！");
		}else {
			request.setAttribute("msg", "修改失败，请重新查询！");
		}
		return str;
	}
	
	
	/**
	 * 閫氳繃ID鍒犻櫎涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/deletePCO",params="act=delete")
	public String delete(HttpServletRequest request,ProductClassOne pco){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "删除"+pco.getId()+"商品一级分类信息"));
		String str = "/pszxgl/productclassone/productclassonequery.jsp";
		int i = service.delete(pco.getId());
		if(i>0){
			request.setAttribute("msg", "删除成功，请重新查询！");
		}else {
			request.setAttribute("msg", "删除失败，请重新查询！");
		}
		return str;
	}

}
