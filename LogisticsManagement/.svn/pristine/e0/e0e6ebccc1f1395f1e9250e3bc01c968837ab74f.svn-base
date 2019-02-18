package com.neusoft.fzgl.deliver.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 任务单实体类
 * @author new
 *
 */
public class TaskFormB {
	private Integer id;
	private Integer orderId;
//	开始日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date taskStartDate;
//	结束日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date taskEndDate;
	private Integer taskTypeId;
	private Integer taskStateId;
	private Integer substationId;
	private Integer shopId;
	private Integer shopNum;
	private String operator;
	private Date operationTime;
	
	private String stateName;
	private String typeName;
	
	public TaskFormB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskFormB(Integer id, Integer orderId, Date taskStartDate, Date taskEndDate, Integer taskTypeId,
			Integer taskStateId, Integer substationId, Integer shopId, Integer shopNum, String operator,
			Date operationTime, String stateName, String typeName) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.taskStartDate = taskStartDate;
		this.taskEndDate = taskEndDate;
		this.taskTypeId = taskTypeId;
		this.taskStateId = taskStateId;
		this.substationId = substationId;
		this.shopId = shopId;
		this.shopNum = shopNum;
		this.operator = operator;
		this.operationTime = operationTime;
		this.stateName = stateName;
		this.typeName = typeName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getTaskStartDate() {
		return taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public Integer getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(Integer taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public Integer getTaskStateId() {
		return taskStateId;
	}

	public void setTaskStateId(Integer taskStateId) {
		this.taskStateId = taskStateId;
	}

	public Integer getSubstationId() {
		return substationId;
	}

	public void setSubstationId(Integer substationId) {
		this.substationId = substationId;
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

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "TaskForm [id=" + id + ", orderId=" + orderId + ", taskStartDate=" + taskStartDate + ", taskEndDate="
				+ taskEndDate + ", taskTypeId=" + taskTypeId + ", taskStateId=" + taskStateId + ", substationId="
				+ substationId + ", shopId=" + shopId + ", shopNum=" + shopNum + ", operator=" + operator
				+ ", operationTime=" + operationTime + ", stateName=" + stateName + ", typeName=" + typeName + "]";
	}
	
	

}
