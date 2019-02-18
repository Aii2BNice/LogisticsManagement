package com.neusoft.finance.invoicedj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.finance.invoicedj.model.InvoiceCXDJ;
import com.neusoft.finance.invoicedj.model.InvoiceDJMapper;
@Service
public class InvoiceDJServiceImpl implements InvoiceDJService{
	@Autowired
	private InvoiceDJMapper dao;
	@Override
	public int updateDJ(Integer id) {
		return dao.updateDJ(id);
	}
	@Override
	public List<InvoiceCXDJ> invoiceCXDJ(InvoiceCXDJ in) {
		return dao.invoiceCXDJ(in);
	}
	@Override
	public List<InvoiceCXDJ> invoiceCXQBDJ() {
		return dao.invoiceCXQBDJ();
	}

}
