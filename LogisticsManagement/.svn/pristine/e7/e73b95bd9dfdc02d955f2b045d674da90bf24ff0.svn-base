package com.neusoft.pszxgl.product.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.pszxgl.product.model.Product;
import com.neusoft.pszxgl.product.service.ProductService;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclassone.service.ProductClassOneService;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwo;
import com.neusoft.pszxgl.productclasstwo.service.ProductClassTwoService;
import com.neusoft.pszxgl.supplier.model.Supplier;
import com.neusoft.pszxgl.supplier.service.SupplierService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 鍟嗗搧绠＄悊Controller
 */
@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private ProductClassOneService serviceone;
	
	@Autowired
	private ProductClassTwoService servicetwo;
	
	@Autowired
	private SupplierService servicesup;
	
	@Autowired
	private JournalService journalService;
	
	/**
	 * 鏌ヨ-鏈夊垎椤靛姛鑳�
	 * @param req
	 * @param u
	 * @return
	 */
	@RequestMapping(value="/productpage", params="act=query")
	public String querypage(HttpServletRequest req, Product pro){
		String str = "/pszxgl/product/productquery.jsp";
		
		//鑾峰彇涓�鍏辨湁澶氬皯鏉¤褰�
		int counts = service.queryCounts(pro);
		
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-begin
		int pageNum = pro.getPageNum();//褰撳墠绗嚑椤�
		int pageCounts = pro.getPageCounts();//姣忛〉澶氬皯鏉�
		int pages = counts/pageCounts + (counts%pageCounts>0?1:0);//涓�鍏卞灏戦〉
		if(pageNum<1){
			pageNum = 1;
		}
		if(pageNum>pages){
			pageNum = pages;
		}
		pro.setPageNum(pageNum);
		pro.setPageCounts(pageCounts);
		pro.setPages(pages);
		pro.setCounts(counts);
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-end
		
		//鑾峰彇鎸囧畾椤电殑鏁版嵁
		List<Product> list = service.queryAllPage(pro);
		System.out.println("xxxxxxxxxxxxxxxxxxxx"+list);
		
		req.getSession().setAttribute("prolist", list);

		return str;
	}
	
	
	
	
	
	
	
	/**
	 * 鏌ヨ鍏ㄩ儴鏁版嵁
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/queryProduct",params="act=query")
	public String query(HttpServletRequest request,Product pro){
		String str = "/pszxgl/product/productquery.jsp";
		List<Product> list = service.queryAll(pro);
		request.getSession().setAttribute("selectedpro", pro);
		request.getSession().setAttribute("prolist", list);
		return str;
	}
	
	
	/**
	 * 閫氳繃ID鏌ヨ涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/toUpdateProduct",params="act=toUpdate")
	public String toUpdate(HttpServletRequest request,Product pro){
		String str = "/pszxgl/product/productupdate.jsp";
		
		Product product = service.queryById(pro.getId());
		request.getSession().setAttribute("pro", product);
		
		List<ProductClassOne> propco = serviceone.queryAll(null);
		request.getSession().setAttribute("propco", propco);
		List<ProductClassTwo> propct = servicetwo.queryAll(new ProductClassTwo(null,null,product.getPco()));
		request.getSession().setAttribute("propct", propct);
		
		List<Supplier> prosup = servicesup.queryAll(null);
		request.getSession().setAttribute("prosup", prosup);
		return str;
	}
	
	
	/**
	 * 澧炲姞涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/addProduct",params="act=add")
	public String add(HttpServletRequest request,Product pro){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "增加"+pro.getId()+"商品信息"));
		String str = "/pszxgl/product/productquery.jsp";
		int i = service.add(pro);
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
	@RequestMapping(value="/updateProduct",params="act=update")
	public String update(HttpServletRequest request,Product pro){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "删除"+pro.getId()+"商品信息"));
		String str = "/pszxgl/product/productquery.jsp";
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx"+pro);
		int i = service.update(pro);
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
	@RequestMapping(value="/deleteProduct",params="act=delete")
	public String delete(HttpServletRequest request,Product pro){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "删除"+pro.getId()+"商品信息"));
		String str = "/pszxgl/product/productquery.jsp";
		int i = service.delete(pro.getId());
		if(i>0){
			request.setAttribute("msg", "删除成功，请重新查询！");
		}else {
			request.setAttribute("msg", "删除失败，请重新查询！");
		}
		return str;
	}

}
