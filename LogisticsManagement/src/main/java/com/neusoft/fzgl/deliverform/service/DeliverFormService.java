package com.neusoft.fzgl.deliverform.service;

import java.util.List;

import com.neusoft.fzgl.deliverform.model.DeliverForm;

public interface DeliverFormService {
	Integer addDeliver(DeliverForm df);
	List<DeliverForm>queryDeliverForm();
	void updateTFS(Integer stateId);
	void updateOFS(Integer taskId);
	DeliverForm queryPrintForm(Integer deliverFormId);
	int updatePrintNum(DeliverForm df);
	int updateDeliverState(Integer deliverId);
}
