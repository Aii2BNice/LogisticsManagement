package com.neusoft.finance.queryallinvoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.finance.queryallinvoice.model.InvoiceMapper;
@Service
public class InvoiceServiceImpl implements InvoiceService{
	@Autowired
	private InvoiceMapper dao;
	@Override
	public List<Invoice> queryAll(Invoice i) {
		return dao.queryAll(i);
	}
	@Override
	public List<Invoice> queryAllPage(Invoice u) {
		return dao.queryAllPage(u);
	}
	@Override
	public int queryCounts(Invoice u) {
		return dao.queryCounts(u);
	}

}
