package com.neusoft.system.journal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.service.JournalService;

/**
 * 日志相关Controller
 * 
 * @author DYQ
 *
 */
@Controller
public class JournalController {

	@Autowired
	private JournalService service;

	/**
	 * 查询日志
	 * 
	 * @param req
	 * @param journal
	 * @return
	 */
	@RequestMapping(value="/queryjournal",params="act=query")
	public String queryJournal(HttpServletRequest req, Journal journal) {
		String url = "/system/journal/queryjournal.jsp";
		
		int counts = service.queryConuts(journal);
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
		
		List<Journal> journals = service.queryJournalPage(journal);
		req.getSession().setAttribute("journals", journals);
		req.setAttribute("j", journal);

		return url;
	}

}
