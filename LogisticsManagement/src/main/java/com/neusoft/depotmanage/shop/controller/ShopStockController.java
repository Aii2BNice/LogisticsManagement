package com.neusoft.depotmanage.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neusoft.depotmanage.depot.model.Depot;
import com.neusoft.depotmanage.depot.service.DepotService;
import com.neusoft.depotmanage.shop.model.ShopStock;
import com.neusoft.depotmanage.shop.service.ShopStockService;
import com.neusoft.pszxgl.product.model.Product;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

@Controller
public class ShopStockController {

	@Autowired
	private ShopStockService service;
	@Autowired
	private DepotService service1;
	@Autowired
	private JournalService journalService;
	
	@RequestMapping(value="queryShopStock",params="act=query")
	public String queryShopStock(HttpServletRequest req,ShopStock s){
		String str = "depotmanage/shopstock/queryshopstock.jsp";
		//分页操作-开始
		int counts = service.queryShopStockCount(s);
		int pageNum = s.getPageNum();// 当前第几页
		int pages = counts / 2 + (counts % 2 > 0 ? 1 : 0);// 一共多少页
		if (pageNum < 1) {
			pageNum = 1;
		}
		if (pageNum > pages) {
			pageNum = pages;
		}
		s.setPageNum(pageNum);
		s.setPages(pages);
		s.setCounts(counts);
		
		//分页操作-结束
		List<ShopStock> queryShopStock = service.queryShopStock(s);
		System.out.println("--list=" + queryShopStock);
		req.setAttribute("queryShopStock", queryShopStock);
		req.setAttribute("shopId", s.getShopId());
		return str;
	}
	
	@RequestMapping(value="queryShopStockId",params="act")
	public String queryShopStockId(HttpServletRequest req,Integer shopId,Integer depotId){
		String str = "depotmanage/shopstock/updateshopstock.jsp";
		ShopStock s = service.queryShopStockId(shopId,depotId);
		req.setAttribute("s", s);
		return str;
	}
	/*修改商品信息*/
	@RequestMapping(value="updateShopStock")
	public String updateShopStockId(HttpServletRequest req,ShopStock s){
		String str = "depotmanage/shopstock/updateshopstock.jsp";
		journalService.insert(new Journal(null, "haoben", null, null, null, null, "修改商品信息"));
		int i = -1;
		System.out.println("s=="+s);
		i= service.updateShopStock(s);
		if(i>0){
			str="depotmanage/shopstock/queryshopstock.jsp";
			req.setAttribute("s", s);
			req.setAttribute("msg", "修改成功");
		}else{
			req.setAttribute("msg", "修改失败");
		}
		
		return str;
	}
	/*增加商品信息*/
	@RequestMapping(value="addShopStock")
	public String addShopStockId(HttpServletRequest req,ShopStock s){
		String str = "depotmanage/shopstock/addshopstock.jsp";
		//日志
		journalService.insert(new Journal(null,"haoben", null, null, null, null, "增加商品"));
		int i = -1;
		i= service.addShopStock(s);
		
		if(i>0){
			str="depotmanage/shopstock/queryshopstock.jsp";
			req.setAttribute("s", s);
			req.setAttribute("msg", "增加商品成功");
		}else{
			req.setAttribute("msg", "增加商品失败"); 
		}
		
		return str;
	}
	
	@RequestMapping(value="jump")
	public String jump(HttpServletRequest req,Product pro,Depot d){
		String str = "depotmanage/shopstock/addshopstock.jsp";
		List<Product> qwer = service.queryAllShop(pro);
		List<Depot> rewq = service1.queryAll(d);
		req.setAttribute("qwer", qwer);
		req.setAttribute("rewq", rewq);
		return str;
	}
	
}
