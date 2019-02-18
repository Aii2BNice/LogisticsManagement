package com.neusoft.fzgl.deliverform.model;

import java.util.Date;

import com.neusoft.fzgl.deliver.model.Deliver;
import com.neusoft.fzgl.taskform.model.TaskForm;

public class DeliverForm {
	private Integer deliverFormId;
	private Integer taskId;
	private String taskState;
	private Integer deliverId;
	private String deliverName;
	private Date deliverFormDate;
	private String clientReaction;
	
//	商品表属性
	private Integer shopId;//商品号
	private Integer shopNum;//商品数量
	private double shopPrice;//商品单价
	private String shopName;//商品名
	private String producerName;//供应商
	private Integer printNum;//打印次数
	public DeliverForm() {
		super();
	}
	public DeliverForm(Integer deliverFormId, Integer taskId, String taskState, Integer deliverId, String deliverName,
			Date deliverFormDate, String clientReaction, Integer shopId, Integer shopNum, double shopPrice,
			String shopName, String producerName, Integer printNum) {
		super();
		this.deliverFormId = deliverFormId;
		this.taskId = taskId;
		this.taskState = taskState;
		this.deliverId = deliverId;
		this.deliverName = deliverName;
		this.deliverFormDate = deliverFormDate;
		this.clientReaction = clientReaction;
		this.shopId = shopId;
		this.shopNum = shopNum;
		this.shopPrice = shopPrice;
		this.shopName = shopName;
		this.producerName = producerName;
		this.printNum = printNum;
	}
	public Integer getDeliverFormId() {
		return deliverFormId;
	}
	public void setDeliverFormId(Integer deliverFormId) {
		this.deliverFormId = deliverFormId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskState() {
		return taskState;
	}
	public void setTaskState(String taskState) {
		this.taskState = taskState;
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
	public Date getDeliverFormDate() {
		return deliverFormDate;
	}
	public void setDeliverFormDate(Date deliverFormDate) {
		this.deliverFormDate = deliverFormDate;
	}
	public String getClientReaction() {
		return clientReaction;
	}
	public void setClientReaction(String clientReaction) {
		this.clientReaction = clientReaction;
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
	public double getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(double shopPrice) {
		this.shopPrice = shopPrice;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public Integer getPrintNum() {
		return printNum;
	}
	public void setPrintNum(Integer printNum) {
		this.printNum = printNum;
	}
	@Override
	public String toString() {
		return "DeliverForm [deliverFormId=" + deliverFormId + ", taskId=" + taskId + ", taskState=" + taskState
				+ ", deliverId=" + deliverId + ", deliverName=" + deliverName + ", deliverFormDate=" + deliverFormDate
				+ ", clientReaction=" + clientReaction + ", shopId=" + shopId + ", shopNum=" + shopNum + ", shopPrice="
				+ shopPrice + ", shopName=" + shopName + ", producerName=" + producerName + ", printNum=" + printNum
				+ "]";
	}
	
	
}
