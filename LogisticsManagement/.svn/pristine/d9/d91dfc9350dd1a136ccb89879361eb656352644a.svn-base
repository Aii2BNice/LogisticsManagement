package com.neusoft.system.journal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.customer.orderform.model.OrderForm;
import com.neusoft.system.journal.model.Journal;
import com.neusoft.system.journal.model.JournalMapper;
/**
 * 日志Service实现类
 * @author new
 *
 */
@Service
public class JournalServiceImpl implements JournalService{
	
	@Autowired
	private JournalMapper dao;
	
	@Override
	public List<Journal> queryAll(Journal journal) {
		return dao.queryAll(journal);
	}

	@Override
	public List<Journal> queryOperation(Journal journal) {
		return dao.queryOperation(journal);
	}

	@Override
	public int insert(Journal journal) {
		return dao.insert(journal);
	}

	@Override
	public int queryPrice(OrderForm orderform) {
		return dao.queryPrice(orderform);
	}

	@Override
	public List<Journal> queryJournalPage(Journal journal) {
		return dao.queryJournalPage(journal);
	}

	@Override
	public int queryConuts(Journal journal) {
		return dao.queryConuts(journal);
	}

	@Override
	public List<Journal> queryOperPage(Journal journal) {
		return dao.queryOperPage(journal);
	}

	@Override
	public int queryOperConuts(Journal journal) {
		return dao.queryOperConuts(journal);
	}

	@Override
	public int queryOperPrice(OrderForm orderform) {
		return dao.queryOperPrice(orderform);
	}

}
