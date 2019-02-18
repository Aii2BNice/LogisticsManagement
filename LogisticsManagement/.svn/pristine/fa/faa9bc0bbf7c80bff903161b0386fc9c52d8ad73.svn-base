package com.neusoft.finance.queryallinvoice.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Invoice {
	private Integer id;
	private Double price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registerDate;
	private Integer invoiceStateId;
	private Integer substationId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date substationDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date customerDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date lostDate;
	private Integer taskId;
	private String loseName;
	private Integer oringalInvoiceId;
	private Integer deliverId;
	private String remark;

	// 增加分页相关的属性begin
	private int pageNum; // 当前第几页数据
	private int pageCounts = 5; // 每页多少条记录
	private int pages; // 一共有多少页
	private int counts; // 一共有多少条记录
	// 增加分页相关的属性end

	public Invoice() {
		super();
	}

	public Invoice(Integer id, Double price, Date registerDate, Integer invoiceStateId, Integer substationId,
			Date substationDate, Date customerDate, Date lostDate, Integer taskId, String loseName,
			Integer oringalInvoiceId, Integer deliverId, String remark) {
		super();
		this.id = id;
		this.price = price;
		this.registerDate = registerDate;
		this.invoiceStateId = invoiceStateId;
		this.substationId = substationId;
		this.substationDate = substationDate;
		this.customerDate = customerDate;
		this.lostDate = lostDate;
		this.taskId = taskId;
		this.loseName = loseName;
		this.oringalInvoiceId = oringalInvoiceId;
		this.deliverId = deliverId;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Integer getInvoiceStateId() {
		return invoiceStateId;
	}

	public void setInvoiceStateId(Integer invoiceStateId) {
		this.invoiceStateId = invoiceStateId;
	}

	public Integer getSubstationId() {
		return substationId;
	}

	public void setSubstationId(Integer substationId) {
		this.substationId = substationId;
	}

	public Date getSubstationDate() {
		return substationDate;
	}

	public void setSubstationDate(Date substationDate) {
		this.substationDate = substationDate;
	}

	public Date getCustomerDate() {
		return customerDate;
	}

	public void setCustomerDate(Date customerDate) {
		this.customerDate = customerDate;
	}

	public Date getLostDate() {
		return lostDate;
	}

	public void setLostDate(Date lostDate) {
		this.lostDate = lostDate;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getLoseName() {
		return loseName;
	}

	public void setLoseName(String loseName) {
		this.loseName = loseName;
	}

	public Integer getOringalInvoiceId() {
		return oringalInvoiceId;
	}

	public void setOringalInvoiceId(Integer oringalInvoiceId) {
		this.oringalInvoiceId = oringalInvoiceId;
	}

	public Integer getDeliverId() {
		return deliverId;
	}

	public void setDeliverId(Integer deliverId) {
		this.deliverId = deliverId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		return "Invoice [id=" + id + ", price=" + price + ", registerDate=" + registerDate + ", invoiceStateId="
				+ invoiceStateId + ", substationId=" + substationId + ", substationDate=" + substationDate
				+ ", customerDate=" + customerDate + ", lostDate=" + lostDate + ", taskId=" + taskId + ", loseName="
				+ loseName + ", oringalInvoiceId=" + oringalInvoiceId + ", deliverId=" + deliverId + ", remark="
				+ remark + "]";
	}

}
