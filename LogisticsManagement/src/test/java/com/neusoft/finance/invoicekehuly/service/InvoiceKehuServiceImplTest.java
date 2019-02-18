package com.neusoft.finance.invoicekehuly.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.finance.invoicekehuly.model.InvoiceCXKehu;
import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.test.BaseTest;

public class InvoiceKehuServiceImplTest extends BaseTest{
	@Autowired
	private InvoiceKehuService service;
	@Test
	public void test() {
		Invoice in=new Invoice();
		List<Invoice> CXKehu = service.invoiceCXKehu( in);
		System.out.println(CXKehu.size());
	}
	@Test
	public void test1() {
		
		
	}
}
