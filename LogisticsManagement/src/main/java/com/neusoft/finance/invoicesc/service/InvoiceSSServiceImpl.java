package com.neusoft.finance.invoicesc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.finance.invoicesc.model.InvoiceSSMapper;
/**
 * 生成发票单service
 * @author new
 *
 */
@Service
public class InvoiceSSServiceImpl implements InvoiceSSService{
	@Autowired
	private InvoiceSSMapper dao;
	@Override
	public int invoice100() {
		return dao.invoice100();
	}

	@Override
	public int invoice500() {
		return dao.invoice500();
	}

	@Override
	public int invoice50() {
		return dao.invoice50();
	}

	@Override
	public int invoice200() {
		return dao.invoice200();
	}

	@Override
	public int invoice1000() {
		return dao.invoice1000();
	}

}
