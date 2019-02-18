package com.neusoft.finance.invoicesubly.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InvoiceSub {
	private Integer id;
	private Integer substationId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date substationDate;
	
	public InvoiceSub() {
		super();
	}

	public InvoiceSub(Integer id, Integer substationId, Date substationDate) {
		super();
		this.id = id;
		this.substationId = substationId;
		this.substationDate = substationDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "InvoiceSub [id=" + id + ", substationId=" + substationId + ", substationDate=" + substationDate + "]";
	}
	
}
