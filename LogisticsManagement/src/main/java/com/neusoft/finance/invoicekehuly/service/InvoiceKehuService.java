package com.neusoft.finance.invoicekehuly.service;

import java.util.List;

import com.neusoft.finance.invoicekehuly.model.InvoiceCXKehu;
import com.neusoft.finance.invoicekehuly.model.InvoiceKehu;
import com.neusoft.finance.queryallinvoice.model.Invoice;

public interface InvoiceKehuService {
	public List<Invoice> invoiceCXKehu(Invoice in);
	public List<Invoice> invoiceCXQBKehu();
	public int updateKehu(Invoice in);
	String queryTaskIdByD(Integer deliverId);
}
