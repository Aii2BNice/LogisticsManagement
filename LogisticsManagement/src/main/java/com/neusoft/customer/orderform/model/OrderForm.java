package com.neusoft.customer.orderform.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * ����ʵ����
 * @author DYQ
 *
 */
public class OrderForm implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer orderId;
	private Integer shopId;
	private Integer clientId;
	private int shopNum;
	private int prderPrice;
	private Integer orderStateId;
	private Integer orderTypeId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date deliverDate;
	private String deliverAddr;
	private String remark;
	private Integer invoice;
	private Integer substationId;
	private String uname;
	private String receiveName;
	private Long receiveTel;
	private Integer receiveZipCode;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDateBegin;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDateEnd;
	
	private String productName;
	private String cname;
	private String orderStateName;
	private String orderTypeName;
	private String depotName;
	
	private int pageNum;
	private int pageCounts = 5;
	private int pages;
	private int counts;
	
	public String getDepotName() {
		return depotName;
	}
	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public OrderForm() {
		super();
	}
	public OrderForm(Integer orderId, Integer shopId, Integer clientId, int shopNum, int prderPrice,
			Integer orderStateId, Integer orderTypeId, Date orderDate, Date deliverDate, String deliverAddr,
			String remark, Integer invoice, Integer substationId, String uname, String receiveName, Long receiveTel,
			Integer receiveZipCode, Date orderDateBegin, Date orderDateEnd, String productName, String cname,
			String orderStateName, String orderTypeName) {
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
		this.uname = uname;
		this.receiveName = receiveName;
		this.receiveTel = receiveTel;
		this.receiveZipCode = receiveZipCode;
		this.orderDateBegin = orderDateBegin;
		this.orderDateEnd = orderDateEnd;
		this.productName = productName;
		this.cname = cname;
		this.orderStateName = orderStateName;
		this.orderTypeName = orderTypeName;
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
	public int getShopNum() {
		return shopNum;
	}
	public void setShopNum(int shopNum) {
		this.shopNum = shopNum;
	}
	public int getPrderPrice() {
		return prderPrice;
	}
	public void setPrderPrice(int prderPrice) {
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public Long getReceiveTel() {
		return receiveTel;
	}
	public void setReceiveTel(Long receiveTel) {
		this.receiveTel = receiveTel;
	}
	public Integer getReceiveZipCode() {
		return receiveZipCode;
	}
	public void setReceiveZipCode(Integer receiveZipCode) {
		this.receiveZipCode = receiveZipCode;
	}
	public Date getOrderDateBegin() {
		return orderDateBegin;
	}
	public void setOrderDateBegin(Date orderDateBegin) {
		this.orderDateBegin = orderDateBegin;
	}
	public Date getOrderDateEnd() {
		return orderDateEnd;
	}
	public void setOrderDateEnd(Date orderDateEnd) {
		this.orderDateEnd = orderDateEnd;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getOrderStateName() {
		return orderStateName;
	}
	public void setOrderStateName(String orderStateName) {
		this.orderStateName = orderStateName;
	}
	public String getOrderTypeName() {
		return orderTypeName;
	}
	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageCounts() {
		return pageCounts;
	}
	public void setPageCounts(int pageCounts) {
		this.pageCounts = pageCounts;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	@Override
	public String toString() {
		return "OrderForm [orderId=" + orderId + ", shopId=" + shopId + ", clientId=" + clientId + ", shopNum="
				+ shopNum + ", prderPrice=" + prderPrice + ", orderStateId=" + orderStateId + ", orderTypeId="
				+ orderTypeId + ", orderDate=" + orderDate + ", deliverDate=" + deliverDate + ", deliverAddr="
				+ deliverAddr + ", remark=" + remark + ", invoice=" + invoice + ", substationId=" + substationId
				+ ", uname=" + uname + ", receiveName=" + receiveName + ", receiveTel=" + receiveTel
				+ ", receiveZipCode=" + receiveZipCode + ", orderDateBegin=" + orderDateBegin + ", orderDateEnd="
				+ orderDateEnd + ", productName=" + productName + ", cname=" + cname + ", orderStateName="
				+ orderStateName + ", orderTypeName=" + orderTypeName + ", depotName=" + depotName + ", pageNum="
				+ pageNum + ", pageCounts=" + pageCounts + ", pages=" + pages + ", counts=" + counts + "]";
	}
}
