package com.neusoft.finance.queryallinvoice.service;

import java.util.List;

import com.neusoft.finance.queryallinvoice.model.Invoice;

public interface InvoiceService {
	public List<Invoice> queryAll(Invoice i);

	// 实现分页查询
	List<Invoice> queryAllPage(Invoice u);

	int queryCounts(Invoice u);
}
