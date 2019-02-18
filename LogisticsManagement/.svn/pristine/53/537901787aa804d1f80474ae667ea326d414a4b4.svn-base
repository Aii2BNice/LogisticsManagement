package com.neusoft.fzgl.deliverform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.fzgl.deliverform.model.DeliverForm;
import com.neusoft.fzgl.deliverform.model.DeliverFormMapper;

@Service
public class DeliverFormServiceImpl implements DeliverFormService{

	@Autowired
	private DeliverFormMapper dao;
	
	@Override
	public void updateTFS(Integer taskId) {
		dao.updateTFS(taskId);
	}
	@Override
	public Integer addDeliver(DeliverForm df) {
		return dao.addDeliver(df);
	}
	@Override
	public List<DeliverForm> queryDeliverForm() {
		return dao.queryDeliverForm();
	}
	@Override
	public DeliverForm queryPrintForm(Integer deliverFormId) {
		return dao.queryPrintForm(deliverFormId);
	}
	@Override
	public int updatePrintNum(DeliverForm df) {
		return dao.updatePrintNum(df);
	}
	@Override
	public int updateDeliverState(Integer deliverId) {
		return dao.updateDeliverState(deliverId);
	}
	@Override
	public void updateOFS(Integer taskId) {
		dao.updateOFS(taskId);
	}

}
