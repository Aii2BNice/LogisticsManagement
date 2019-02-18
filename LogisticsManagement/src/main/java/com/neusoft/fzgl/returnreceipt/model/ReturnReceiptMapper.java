package com.neusoft.fzgl.returnreceipt.model;

import java.util.List;


public interface ReturnReceiptMapper {
	List<ReturnReceipt>queryReturnReceipt(ReturnReceipt rr);
	int updateTaskState(ReturnReceipt rr);
	int updateDeliverState(Integer deliverId);
	int queryDeliverId(Integer deliverFormId);
	int queryTaskState(Integer deliverFormId);
	int updateOrderState(ReturnReceipt rr);
	int updateOrderDeliverDate(ReturnReceipt rr);
}
