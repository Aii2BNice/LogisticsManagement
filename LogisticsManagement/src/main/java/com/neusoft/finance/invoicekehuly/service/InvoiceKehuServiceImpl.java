package com.neusoft.finance.invoicekehuly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.finance.invoicekehuly.model.InvoiceCXKehu;
import com.neusoft.finance.invoicekehuly.model.InvoiceKehu;
import com.neusoft.finance.invoicekehuly.model.InvoiceKehuMapper;
import com.neusoft.finance.queryallinvoice.model.Invoice;
@Service
public class InvoiceKehuServiceImpl implements InvoiceKehuService{
	@Autowired
	private InvoiceKehuMapper dao;
	
	@Override
	public int updateKehu(Invoice in) {
		return dao.updateKehu(in);
	}
	@Override
	public List<Invoice> invoiceCXKehu(Invoice in) {
		return dao.invoiceCXKehu(in);
	}
	@Override
	public List<Invoice> invoiceCXQBKehu() {
		return dao.invoiceCXQBKehu();
	}
	@Override
	public String queryTaskIdByD(Integer deliverId) {
		return dao.queryTaskIdByD(deliverId);
	}

}
