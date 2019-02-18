package com.neusoft.system.user.model;

import java.io.Serializable;

/**
 * �û�ʵ����
 * 
 * @author DYQ
 *
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String uname;
	private String pass;
	private Integer powerId;
	private String url;
	
	private String powerName;
	private String validCode;

	private int pageNum;
	private int pageCounts = 3;
	private int pages;
	private int counts;

	public User() {
		super();
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

	public User(String uname, String pass, Integer powerId, String powerName, String validCode) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.powerId = powerId;
		this.powerName = powerName;
		this.validCode = validCode;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String getValidCode() {
		return validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pass=" + pass + ", powerId=" + powerId + ", url=" + url + ", powerName="
				+ powerName + ", validCode=" + validCode + ", pageNum=" + pageNum + ", pageCounts=" + pageCounts
				+ ", pages=" + pages + ", counts=" + counts + "]";
	}
}
