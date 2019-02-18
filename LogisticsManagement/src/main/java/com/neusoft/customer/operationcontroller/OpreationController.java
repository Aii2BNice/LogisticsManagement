package com.neusoft.customer.operationcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.customer.orderform.model.OrderForm;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;
/**
 * 客服操作量查询ontroller
 * @author DYQ
 *
 */
@Controller
public class OpreationController {
	
	@Autowired
	private JournalService service;
	
	/**
	 * 客服操作量查询
	 * @param req
	 * @param journal
	 * @return
	 */
	@RequestMapping("queryOperPage")
	public String queryOperation(HttpServletRequest req,Journal journal,OrderForm orderform){
		
		orderform.setOrderId(journal.getOrderId());
		if(orderform.getOrderTypeId()!=null){
			switch(orderform.getOrderTypeId()){
			case 1:journal.setOperation("新订");break;
			case 2:journal.setOperation("退订");break;
			case 3:journal.setOperation("换货");break;
			case 4:journal.setOperation("退货");break;
			default:journal.setOperation(null);break;
			}
		}
		orderform.setOrderDateBegin(journal.getJournalBegin());
		orderform.setOrderDateEnd(journal.getJournalEnd());
		orderform.setUname(journal.getUserName());
		
		System.out.println("------------"+journal.getUserName());
		System.out.println("------------"+orderform);
		
		int price = service.queryOperPrice(orderform);
		
		int counts = service.queryOperConuts(journal);
		// 进行分页相关数据的计算-begin
		int pageNum = journal.getPageNum();// 当前第几页
		int pageCounts = journal.getPageCounts();// 每页多少条
		int pages = counts / pageCounts + (counts % pageCounts > 0 ? 1 : 0);// 一共多少页
		if (pageNum < 1) {
			pageNum = 1;
		}
		if (pageNum > pages) {
			pageNum = pages;
		}
		journal.setPageNum(pageNum);
		journal.setPageCounts(pageCounts);
		journal.setPages(pages);
		journal.setCounts(counts);
		// 进行分页相关数据的计算-end
		List<Journal> operations = service.queryOperPage(journal);
		
		req.setAttribute("operations", operations);
		req.setAttribute("price", price);
		return "/customer/operation/queryoperation.jsp";
	}
}
