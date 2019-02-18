package com.neusoft.fzgl.deliverform.model;

import java.util.List;

public interface DeliverFormMapper {
	Integer addDeliver(DeliverForm df);
	List<DeliverForm>queryDeliverForm();
	void updateTFS(Integer taskId);
	void updateOFS(Integer taskId);
	DeliverForm queryPrintForm(Integer deliverFormId);
	int updatePrintNum(DeliverForm df);
	int updateDeliverState(Integer deliverId);
	
}
