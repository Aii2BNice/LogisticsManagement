package com.neusoft.finance.queryallinvoice.service;

import java.util.List;

import com.neusoft.finance.queryallinvoice.model.Invoice;

public interface InvoiceService {
	public List<Invoice> queryAll(Invoice i);

	// ʵ�ַ�ҳ��ѯ
	List<Invoice> queryAllPage(Invoice u);

	int queryCounts(Invoice u);
}
