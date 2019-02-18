package com.neusoft.finance.invoicedj.service;

import java.util.List;

import com.neusoft.finance.invoicedj.model.InvoiceCXDJ;

public interface InvoiceDJService {
	public int updateDJ(Integer id);
	public List<InvoiceCXDJ> invoiceCXDJ(InvoiceCXDJ in);
	public List<InvoiceCXDJ> invoiceCXQBDJ();
}
