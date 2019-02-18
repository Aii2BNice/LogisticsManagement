package com.neusoft.system.journal.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 日志实体类
 * @author DYQ
 *
 */
public class Journal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer journalId;
	private String userName;
	private Integer orderId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date journalBegin;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date journaldate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date journalEnd;
	private String operation;
	
	private int pageNum;
	private int pageCounts = 5;
	private int pages;
	private int counts;
	
	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Journal(Integer journalId, String userName, Integer orderId, Date journalBegin, Date journaldate,
			Date journalEnd, String operation) {
		super();
		this.journalId = journalId;
		this.userName = userName;
		this.orderId = orderId;
		this.journalBegin = journalBegin;
		this.journaldate = journaldate;
		this.journalEnd = journalEnd;
		this.operation = operation;
	}
	public Integer getJournalId() {
		return journalId;
	}
	public void setJournalId(Integer journalId) {
		this.journalId = journalId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getJournalBegin() {
		return journalBegin;
	}
	public void setJournalBegin(Date journalBegin) {
		this.journalBegin = journalBegin;
	}
	public Date getJournaldate() {
		return journaldate;
	}
	public void setJournaldate(Date journaldate) {
		this.journaldate = journaldate;
	}
	public Date getJournalEnd() {
		return journalEnd;
	}
	public void setJournalEnd(Date journalEnd) {
		this.journalEnd = journalEnd;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
		return "Journal [journalId=" + journalId + ", userName=" + userName + ", orderId=" + orderId + ", journalBegin="
				+ journalBegin + ", journaldate=" + journaldate + ", journalEnd=" + journalEnd + ", operation="
				+ operation + "]";
	}
}
