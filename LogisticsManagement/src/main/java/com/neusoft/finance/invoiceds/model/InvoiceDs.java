package com.neusoft.finance.invoiceds.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InvoiceDs {
	private Integer id;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date loseDate;
	private String loseName;
	
	public InvoiceDs() {
		super();
	}

	public InvoiceDs(Integer id, Date loseDate, String loseName) {
		super();
		this.id = id;
		this.loseDate = loseDate;
		this.loseName = loseName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLoseDate() {
		return loseDate;
	}

	public void setLoseDate(Date loseDate) {
		this.loseDate = loseDate;
	}

	public String getLoseName() {
		return loseName;
	}

	public void setLoseName(String loseName) {
		this.loseName = loseName;
	}

	@Override
	public String toString() {
		return "InvoiceDs [id=" + id + ", loseDate=" + loseDate + ", loseName=" + loseName + "]";
	}
	
}
