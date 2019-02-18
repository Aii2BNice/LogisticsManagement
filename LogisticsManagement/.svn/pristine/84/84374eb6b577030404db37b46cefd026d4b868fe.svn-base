package com.neusoft.fzgl.querypayment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.fzgl.querypayment.model.QueryPayment;
import com.neusoft.fzgl.querypayment.model.QueryPaymentMapper;

@Service
public class QueryPaymentServiceImpl implements QueryPaymentService{

	@Autowired
	private QueryPaymentMapper dao;
	
	@Override
	public List<QueryPayment> queryPayment(QueryPayment qp) {
		return dao.queryPayment(qp);
	}

}
