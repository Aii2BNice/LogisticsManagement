package com.neusoft.finance.invoicedj.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.finance.invoicedj.model.InvoiceCXDJ;
import com.neusoft.test.BaseTest;

public class InvoiceDJServiceImplTest extends BaseTest{
	@Autowired
	private InvoiceDJService service;
	@Test
	public void test() {
	    service.updateDJ(2);
	}
	//@Test
	public void test1(){
		List<InvoiceCXDJ> CXDJ = service.invoiceCXQBDJ();
		System.out.println(CXDJ.size());
		
	}
}
