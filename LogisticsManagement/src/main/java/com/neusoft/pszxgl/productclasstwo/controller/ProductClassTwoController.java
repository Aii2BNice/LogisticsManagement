package com.neusoft.pszxgl.productclasstwo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.neusoft.pszxgl.productclassone.model.ProductClassOne;
import com.neusoft.pszxgl.productclasstwo.model.ProductClassTwo;
import com.neusoft.pszxgl.productclasstwo.service.ProductClassTwoService;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 鍟嗗搧浜岀骇鍒嗙被绠＄悊Controller
 */
@Controller
public class ProductClassTwoController {
	
	@Autowired
	private ProductClassTwoService service;
	
	@Autowired
	private JournalService journalService;
	
	/**
	 * 鏌ヨ-鏈夊垎椤靛姛鑳�
	 * @param req
	 * @param u
	 * @return
	 */
	@RequestMapping(value="/propctpage", params="act=query")
	public String querypage(HttpServletRequest req, ProductClassTwo pct){
		String str = "/pszxgl/productclasstwo/productclasstwoquery.jsp";
		
		//鑾峰彇涓�鍏辨湁澶氬皯鏉¤褰�
		int counts = service.queryCounts(pct);
		
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-begin
		int pageNum = pct.getPageNum();//褰撳墠绗嚑椤�
		int pageCounts = pct.getPageCounts();//姣忛〉澶氬皯鏉�
		int pages = counts/pageCounts + (counts%pageCounts>0?1:0);//涓�鍏卞灏戦〉
		if(pageNum<1){
			pageNum = 1;
		}
		if(pageNum>pages){
			pageNum = pages;
		}
		pct.setPageNum(pageNum);
		pct.setPageCounts(pageCounts);
		pct.setPages(pages);
		pct.setCounts(counts);
		//杩涜鍒嗛〉鐩稿叧鏁版嵁鐨勮绠�-end
		
		//鑾峰彇鎸囧畾椤电殑鏁版嵁
		List<ProductClassTwo> list = service.queryAllPage(pct);
		System.out.println("xxxxxxxxxxxxxxxxxxxx"+list);
		
		req.getSession().setAttribute("pctlist", list);

		return str;
	}
	
	
	
	//鍟嗗搧鍒嗙被绾ц仈鏄剧ず-----begin----------------------------------------------
	@RequestMapping(value = "selectPct", method = {RequestMethod.POST})
	@ResponseBody
	public List<ProductClassTwo> jumpPage(HttpServletRequest request){
		Integer pcoid=Integer.parseInt(request.getParameter("pcoid"));
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx"+pcoid);
		ProductClassTwo two = new ProductClassTwo(null, null, new ProductClassOne(pcoid,null));
		List<ProductClassTwo> list = service.queryAll(two);
		return list;
	}
	//鍟嗗搧鍒嗙被绾ц仈鏄剧ず-----end-------------------------------------------------
	
	/**
	 * 鏌ヨ鍏ㄩ儴鏁版嵁
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/queryPCT",params="act=query")
	public String query(HttpServletRequest request,ProductClassTwo pct){
		String str = "/pszxgl/productclasstwo/productclasstwoquery.jsp";
		List<ProductClassTwo> list = service.queryAll(pct);
		request.getSession().setAttribute("pctlist", list);
		return str;
	}
	
	
	/**
	 * 閫氳繃ID鏌ヨ涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/toUpdatePCT",params="act=toUpdate")
	public String toUpdate(HttpServletRequest request,ProductClassTwo pct){
		String str = "/pszxgl/productclasstwo/productclasstwoupdate.jsp";
		ProductClassTwo proct = service.queryById(pct.getId());
		request.getSession().setAttribute("proct", proct);
		return str;
	}
	
	
	/**
	 * 澧炲姞涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/addPCT",params="act=add")
	public String add(HttpServletRequest request,ProductClassTwo pct){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "澧炲姞"+pct.getId()+"鍟嗗搧浜岀骇鍒嗙被淇℃伅"));
		String str = "/pszxgl/productclasstwo/productclasstwoquery.jsp";
		int i = service.add(pct);
		if(i>0){
			request.setAttribute("msg", "澧炲姞鎴愬姛锛佽閲嶆柊鏌ヨ");
		}else {
			request.setAttribute("msg", "澧炲姞澶辫触锛�");
		}
		return str;
	}
	
	/**
	 * 淇敼涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/updatePCT",params="act=update")
	public String update(HttpServletRequest request,ProductClassTwo pct){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "淇敼"+pct.getId()+"鍟嗗搧浜岀骇鍒嗙被淇℃伅"));
		String str = "/pszxgl/productclasstwo/productclasstwoquery.jsp";
		int i = service.update(pct);
		if(i>0){
			request.setAttribute("msg", "淇敼鎴愬姛锛佽閲嶆柊鏌ヨ");
		}else {
			request.setAttribute("msg", "淇敼澶辫触锛�");
		}
		return str;
	}
	
	
	/**
	 * 閫氳繃ID鍒犻櫎涓�鏉℃暟鎹�
	 * @param request 璇锋眰瀵硅薄
	 * @param pco 灏佽鍓嶅彴鎻愪氦鐨勮姹傚弬鏁�
	 * @return 杩斿洖URL
	 */
	@RequestMapping(value="/deletePCT",params="act=delete")
	public String delete(HttpServletRequest request,ProductClassTwo pct){
		journalService.insert(new Journal(null, "nongkai", null, null, null, null, "鍒犻櫎"+pct.getId()+"鍟嗗搧浜岀骇鍒嗙被淇℃伅"));
		String str = "/pszxgl/productclasstwo/productclasstwoquery.jsp";
		int i = service.delete(pct.getId());
		if(i>0){
			request.setAttribute("msg", "鍒犻櫎鎴愬姛锛佽閲嶆柊鏌ヨ");
		}else {
			request.setAttribute("msg", "鍒犻櫎澶辫触锛�");
		}
		return str;
	}

}
