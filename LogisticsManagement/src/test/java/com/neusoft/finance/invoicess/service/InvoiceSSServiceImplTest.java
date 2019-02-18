package com.neusoft.finance.invoicess.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.finance.invoicesc.service.InvoiceSSService;
import com.neusoft.test.BaseTest;

public class InvoiceSSServiceImplTest extends BaseTest{
	@Autowired 
	private InvoiceSSService service;
	//@Test
	public void testInvoice100() {
		service.invoice100();
	}

	@Test
	public void testInvoice500() {
		service.invoice500();
	}

}
