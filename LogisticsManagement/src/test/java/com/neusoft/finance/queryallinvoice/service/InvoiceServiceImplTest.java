package com.neusoft.finance.queryallinvoice.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.finance.queryallinvoice.model.Invoice;
import com.neusoft.test.BaseTest;

public class InvoiceServiceImplTest extends BaseTest{
	@Autowired
	private InvoiceService service;
	@Test
	public void test() {
		Invoice i=new Invoice();
		List<Invoice> queryAll = service.queryAll(i);
		System.out.println(queryAll.size());
	}

}
