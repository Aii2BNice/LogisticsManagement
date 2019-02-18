package com.neusoft.fzgl.querypayment.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class QueryPayment {
	private Integer deliverFormId; //配送签收单号
	private Integer shopId;//商品号
	private String shopName;//商品名
	private Integer shopNum;//商品数量
	private double shopPrice;//商品单价
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date taskStartDate;//开始日期
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date taskEndDate;//结束日期
	
	private String stateName;//任务状态
	private String typeName;//任务类型
	public QueryPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryPayment(Integer deliverFormId, Integer shopId, String shopName, Integer shopNum, double shopPrice,
			Date taskStartDate, Date taskEndDate, String stateName, String typeName) {
		super();
		this.deliverFormId = deliverFormId;
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopNum = shopNum;
		this.shopPrice = shopPrice;
		this.taskStartDate = taskStartDate;
		this.taskEndDate = taskEndDate;
		this.stateName = stateName;
		this.typeName = typeName;
	}
	public Integer getDeliverFormId() {
		return deliverFormId;
	}
	public void setDeliverFormId(Integer deliverFormId) {
		this.deliverFormId = deliverFormId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Integer getShopNum() {
		return shopNum;
	}
	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}
	public double getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(double shopPrice) {
		this.shopPrice = shopPrice;
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
		return "QueryPayment [deliverFormId=" + deliverFormId + ", shopId=" + shopId + ", shopName=" + shopName
				+ ", shopNum=" + shopNum + ", shopPrice=" + shopPrice + ", taskStartDate=" + taskStartDate
				+ ", taskEndDate=" + taskEndDate + ", stateName=" + stateName + ", typeName=" + typeName + "]";
	}
	
	

}
