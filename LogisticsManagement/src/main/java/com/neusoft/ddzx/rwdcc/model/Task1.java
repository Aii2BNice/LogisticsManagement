package com.neusoft.ddzx.rwdcc.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 任务单 pojo类
 * @author new
 *
 */
public class Task1 {
	private Integer id;
	private Integer taskStateId;
	private Integer taskTypeId;
	private Integer orderId;
	private Integer substationId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date taskDate;
	private Integer shopId;
	private Integer shopNum;
	private String operator;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date operationTime;
	
	public Task1() {
		super();
	}

	public Task1(Integer id, Integer taskStateId, Integer taskTypeId, Integer orderId, Integer substationId,
			Date taskDate, Integer shopId, Integer shopNum, String operator, Date operationTime) {
		super();
		this.id = id;
		this.taskStateId = taskStateId;
		this.taskTypeId = taskTypeId;
		this.orderId = orderId;
		this.substationId = substationId;
		this.taskDate = taskDate;
		this.shopId = shopId;
		this.shopNum = shopNum;
		this.operator = operator;
		this.operationTime = operationTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTaskStateId() {
		return taskStateId;
	}

	public void setTaskStateId(Integer taskStateId) {
		this.taskStateId = taskStateId;
	}

	public Integer getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(Integer taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getSubstationId() {
		return substationId;
	}

	public void setSubstationId(Integer substationId) {
		this.substationId = substationId;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getShopNum() {
		return shopNum;
	}

	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskStateId=" + taskStateId + ", taskTypeId=" + taskTypeId + ", orderId=" + orderId
				+ ", substationId=" + substationId + ", taskDate=" + taskDate + ", shopId=" + shopId + ", shopNum="
				+ shopNum + ", operator=" + operator + ", operationTime=" + operationTime + "]";
	}
	
	
}
