package com.neusoft.finance.invoicesubly.service;

import java.util.List;

import com.neusoft.finance.invoicesubly.model.InvoiceSub;
import com.neusoft.finance.queryallinvoice.model.Invoice;

public interface InvoiceSubService {
	public List<Invoice> invoiceCXSub();
	public int updateLY(InvoiceSub sub);
	public List<Invoice> invoiceCXSubBy(Invoice in);
}
