package com.neusoft.ddzx.qhddztxg.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * ������ pojo��
 * @author new
 *
 */
public class Order1 {
	private Integer orderId;
	private Integer shopId;
	private Integer clientId;
	private String shopNum;
	private Integer prderPrice;
	private Integer orderStateId;
	private Integer orderTypeId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deliverDate;
	private String deliverAddr;
	private String remark;
	private Integer invoice;
	private Integer substationId;
	private Integer operationId;
	private String receiveName;
	private Integer receiveTel;
	private String receiveZipcode;

	public Order1() {
		super();
	}

	public Order1(Integer orderId, Integer shopId, Integer clientId, String shopNum, Integer prderPrice,
			Integer orderStateId, Integer orderTypeId, Date orderDate, Date deliverDate, String deliverAddr,
			String remark, Integer invoice, Integer substationId, Integer operationId, String receiveName,
			Integer receiveTel, String receiveZipcode) {
		super();
		this.orderId = orderId;
		this.shopId = shopId;
		this.clientId = clientId;
		this.shopNum = shopNum;
		this.prderPrice = prderPrice;
		this.orderStateId = orderStateId;
		this.orderTypeId = orderTypeId;
		this.orderDate = orderDate;
		this.deliverDate = deliverDate;
		this.deliverAddr = deliverAddr;
		this.remark = remark;
		this.invoice = invoice;
		this.substationId = substationId;
		this.operationId = operationId;
		this.receiveName = receiveName;
		this.receiveTel = receiveTel;
		this.receiveZipcode = receiveZipcode;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getShopNum() {
		return shopNum;
	}

	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}

	public Integer getPrderPrice() {
		return prderPrice;
	}

	public void setPrderPrice(Integer prderPrice) {
		this.prderPrice = prderPrice;
	}

	public Integer getOrderStateId() {
		return orderStateId;
	}

	public void setOrderStateId(Integer orderStateId) {
		this.orderStateId = orderStateId;
	}

	public Integer getOrderTypeId() {
		return orderTypeId;
	}

	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	public String getDeliverAddr() {
		return deliverAddr;
	}

	public void setDeliverAddr(String deliverAddr) {
		this.deliverAddr = deliverAddr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getInvoice() {
		return invoice;
	}

	public void setInvoice(Integer invoice) {
		this.invoice = invoice;
	}

	public Integer getSubstationId() {
		return substationId;
	}

	public void setSubstationId(Integer substationId) {
		this.substationId = substationId;
	}

	public Integer getOperationId() {
		return operationId;
	}

	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public Integer getReceiveTel() {
		return receiveTel;
	}

	public void setReceiveTel(Integer receiveTel) {
		this.receiveTel = receiveTel;
	}

	public String getReceiveZipcode() {
		return receiveZipcode;
	}

	public void setReceiveZipcode(String receiveZipcode) {
		this.receiveZipcode = receiveZipcode;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", shopId=" + shopId + ", clientId=" + clientId + ", shopNum=" + shopNum
				+ ", prderPrice=" + prderPrice + ", orderStateId=" + orderStateId + ", orderTypeId=" + orderTypeId
				+ ", orderDate=" + orderDate + ", deliverDate=" + deliverDate + ", deliverAddr=" + deliverAddr
				+ ", remark=" + remark + ", invoice=" + invoice + ", substationId=" + substationId + ", operationId="
				+ operationId + ", receiveName=" + receiveName + ", receiveTel=" + receiveTel + ", receiveZipcode="
				+ receiveZipcode + "]";
	}

}
