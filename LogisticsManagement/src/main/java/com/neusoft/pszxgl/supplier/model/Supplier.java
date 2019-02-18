package com.neusoft.pszxgl.supplier.model;

import java.io.Serializable;

/**
 * 供应商信息 
 * id:供应商编号 
 * name:供应商名称 
 * address:地址 
 * contactName:联系人 
 * contactPhone:联系电话
 * openingBank:开户银行 
 * accountNumber:银行账号 
 * fax:传真 
 * postcode:邮编 
 * artificalPerson:法人
 * remark:备注
 */
public class Supplier implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String address;
	private String contactName;
	private String contactPhone;
	private String openingBank;
	private String accountNumber;
	private String fax;
	private Integer postcode;
	private String artificalPerson;
	private String remark;

	//增加分页相关的属性begin
	private int pageNum; //当前第几页数据
	private int pageCounts=2; //每页多少条记录
	private int pages; //一共有多少页
	private int counts; //一共有多少条记录
	//增加分页相关的属性end
	
	public Supplier() {
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

	public Supplier(Integer id, String name, String address, String contactName, String contactPhone,
			String openingBank, String accountNumber, String fax, Integer postcode, String artificalPerson,
			String remark) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.openingBank = openingBank;
		this.accountNumber = accountNumber;
		this.fax = fax;
		this.postcode = postcode;
		this.artificalPerson = artificalPerson;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getOpeningBank() {
		return openingBank;
	}

	public void setOpeningBank(String openingBank) {
		this.openingBank = openingBank;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getPostcode() {
		return postcode;
	}

	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}

	public String getArtificalPerson() {
		return artificalPerson;
	}

	public void setArtificalPerson(String artificalPerson) {
		this.artificalPerson = artificalPerson;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", contactName=" + contactName
				+ ", contactPhone=" + contactPhone + ", openingBank=" + openingBank + ", accountNumber=" + accountNumber
				+ ", fax=" + fax + ", postcode=" + postcode + ", artificalPerson=" + artificalPerson + ", remark="
				+ remark + "]";
	}

}
