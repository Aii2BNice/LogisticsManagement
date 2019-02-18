package com.neusoft.finance.invoicesubly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.finance.invoicesubly.model.InvoiceSub;
import com.neusoft.finance.invoicesubly.model.InvoiceSubMapper;
import com.neusoft.finance.queryallinvoice.model.Invoice;
@Service
public class InvoiceSubServiceImpl implements InvoiceSubService{
	@Autowired
	private InvoiceSubMapper dao;
	@Override
	public List<Invoice> invoiceCXSub() {
		return dao.invoiceCXSub();
	}
	@Override
	public int updateLY(InvoiceSub sub) {
		return dao.updateLY(sub);
	}
	@Override
	public List<Invoice> invoiceCXSubBy(Invoice in) {
		return dao.invoiceCXSubBy(in);
	}

}
