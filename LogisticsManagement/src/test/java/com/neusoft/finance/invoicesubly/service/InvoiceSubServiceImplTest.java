package com.neusoft.finance.invoicesubly.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.finance.invoicesubly.model.InvoiceSub;
import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.test.BaseTest;

public class InvoiceSubServiceImplTest extends BaseTest{
	@Autowired
	private InvoiceSubService service;
	//@Test
	public void test() {
		List<Invoice> CXSub = service.invoiceCXSub();
		System.out.println(CXSub.size());
	}
	@Test
	public void test1() {
		service.updateLY(new InvoiceSub(2,1,new Date()));
		
	}
}
