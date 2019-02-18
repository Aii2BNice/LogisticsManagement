package com.neusoft.fzgl.returnreceipt.model;

public class ReturnReceipt {
	private Integer deliverFormId;//ǩ�յ���
	private Integer deliverId;//����Ա��
	private String deliverName;//����Ա��
	private Integer taskStateId;//����״̬��
	private String typeName;//��������
	private Integer orderStateId;//�������ͺ�
	public ReturnReceipt() {
		super();
	}
	public ReturnReceipt(Integer deliverFormId, Integer deliverId, String deliverName, Integer taskStateId,
			String typeName, Integer orderStateId) {
		super();
		this.deliverFormId = deliverFormId;
		this.deliverId = deliverId;
		this.deliverName = deliverName;
		this.taskStateId = taskStateId;
		this.typeName = typeName;
		this.orderStateId = orderStateId;
	}
	public Integer getDeliverFormId() {
		return deliverFormId;
	}
	public void setDeliverFormId(Integer deliverFormId) {
		this.deliverFormId = deliverFormId;
	}
	public Integer getDeliverId() {
		return deliverId;
	}
	public void setDeliverId(Integer deliverId) {
		this.deliverId = deliverId;
	}
	public String getDeliverName() {
		return deliverName;
	}
	public void setDeliverName(String deliverName) {
		this.deliverName = deliverName;
	}
	public Integer getTaskStateId() {
		return taskStateId;
	}
	public void setTaskStateId(Integer taskStateId) {
		this.taskStateId = taskStateId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderStateId() {
		return orderStateId;
	}
	public void setOrderStateId(Integer orderStateId) {
		this.orderStateId = orderStateId;
	}
	@Override
	public String toString() {
		return "ReturnReceipt [deliverFormId=" + deliverFormId + ", deliverId=" + deliverId + ", deliverName="
				+ deliverName + ", taskStateId=" + taskStateId + ", typeName=" + typeName + ", orderStateId="
				+ orderStateId + "]";
	}
	
}
