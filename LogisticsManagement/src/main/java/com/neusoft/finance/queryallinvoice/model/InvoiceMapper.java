package com.neusoft.finance.queryallinvoice.model;

import java.util.List;

public interface InvoiceMapper {
	public List<Invoice> queryAll(Invoice i);

	// 实现分页查询
	List<Invoice> queryAllPage(Invoice u);

	int queryCounts(Invoice u);
}
