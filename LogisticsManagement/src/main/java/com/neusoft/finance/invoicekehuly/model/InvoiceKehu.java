package com.neusoft.finance.invoicekehuly.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InvoiceKehu {
	private Integer id;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date customerDate;
	private Integer taskId;
	private Integer deliverId;
	public InvoiceKehu() {
		super();
	}
	public InvoiceKehu(Integer id, Date customerDate, Integer taskId, Integer deliverId) {
		super();
		this.id = id;
		this.customerDate = customerDate;
		this.taskId = taskId;
		this.deliverId = deliverId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCustomerDate() {
		return customerDate;
	}
	public void setCustomerDate(Date customerDate) {
		this.customerDate = customerDate;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getDeliverId() {
		return deliverId;
	}
	public void setDeliverId(Integer deliverId) {
		this.deliverId = deliverId;
	}
	@Override
	public String toString() {
		return "InvoiceKehu [id=" + id + ", customerDate=" + customerDate + ", taskId=" + taskId + ", deliverId="
				+ deliverId + "]";
	}
	
}
