package com.neusoft.finance.invoiceds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.finance.invoiceds.model.InvoiceDs;
import com.neusoft.finance.invoiceds.model.InvoiceDsMapper;
@Service
public class InvoiceDsServiceImpl implements InvoiceDsService{
	@Autowired
	private InvoiceDsMapper dao;
	@Override
	public int invoiceDs(InvoiceDs ds) {
		return dao.invoiceDs(ds);
	}
	@Override
	public int invoiceCXDS(Integer id) {
		return dao.invoiceCXDS(id);
	}

}
