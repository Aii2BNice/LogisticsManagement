package com.neusoft.system.journal.model;

import java.util.List;

import com.neusoft.customer.orderform.model.OrderForm;
/**
 * ��־Mapper�ӿ�
 * @author DYQ
 *
 */
public interface JournalMapper {
	
	List<Journal> queryAll(Journal journal);
	List<Journal> queryOperation(Journal journal);
	int insert(Journal journal);
	int queryPrice(OrderForm orderform);
	List<Journal> queryJournalPage(Journal journal);
	int queryConuts(Journal journal);
	List<Journal> queryOperPage(Journal journal);
	int queryOperConuts(Journal journal);
	int queryOperPrice(OrderForm orderform);
}
