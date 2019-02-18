package com.neusoft.finance.invoicekehuly.model;

import java.util.List;

import com.neusoft.finance.queryallinvoice.model.Invoice;

public interface InvoiceKehuMapper {
	public List<Invoice> invoiceCXKehu(Invoice in);
	public List<Invoice> invoiceCXQBKehu();
	public int updateKehu(Invoice in);
	String queryTaskIdByD(Integer deliverId);
}
