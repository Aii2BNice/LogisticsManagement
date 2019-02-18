package com.neusoft.fzgl.returnreceipt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.fzgl.returnreceipt.model.ReturnReceipt;
import com.neusoft.fzgl.returnreceipt.model.ReturnReceiptMapper;

@Service
public class ReturnReceiptServiceImpl implements ReturnReceiptService{
	
	@Autowired
	private ReturnReceiptMapper dao;

	@Override
	public List<ReturnReceipt> queryReturnReceipt(ReturnReceipt rr) {
		return dao.queryReturnReceipt(rr);
	}

	@Override
	public int updateTaskState(ReturnReceipt rr) {
		return dao.updateTaskState(rr);
	}

	@Override
	public int updateDeliverState(Integer deliverId) {
		return dao.updateDeliverState(deliverId);
	}

	@Override
	public int queryDeliverId(Integer deliverFormId) {
		return dao.queryDeliverId(deliverFormId);
	}

	@Override
	public int queryTaskState(Integer deliverFormId) {
		return dao.queryTaskState(deliverFormId);
	}

	@Override
	public int updateOrderState(ReturnReceipt rr) {
		return dao.updateOrderState(rr);
	}

	@Override
	public int updateOrderDeliverDate(ReturnReceipt rr) {
		return dao.updateOrderDeliverDate(rr);
	}

}
