package com.neusoft.depotmanage.shop.model;
/**
 * 商品库存信息实体类
 * @author new
 *
 */

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ShopStock {

	/*
	 * 属性
	 */
	private Integer shopId;
	private String shopName;
	private Integer depotId;
	private String remark;
	private Integer amount;
	private Integer safeAmount;
	private Integer lackAmount;
	private Integer arrangedAmount;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date lastarrangedDate;
	private Integer returndAmount;
	private Integer allocatableAmount;
	private Integer allocatedAmount;
	private Integer shopStockId;

	//分页相关
	private Integer pageNum;//当前第几页
	private Integer pages; //一共有多少页
	private Integer counts; //一共有多少条记录
	
	
	public Integer getPageNum() {
		return pageNum;
	}


	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}


	public Integer getPages() {
		return pages;
	}


	public void setPages(Integer pages) {
		this.pages = pages;
	}


	public Integer getCounts() {
		return counts;
	}


	public void setCounts(Integer counts) {
		this.counts = counts;
	}


	public Integer getShopStockId() {
		return shopStockId;
	}


	public void setShopStockId(Integer shopStockId) {
		this.shopStockId = shopStockId;
	}


	public ShopStock() {
		super();
	}


	public ShopStock(Integer shopId, String shopName, Integer depotId, String remark, Integer amount,
			Integer safeAmount, Integer lackAmount, Integer arrangedAmount, Date lastarrangedDate,
			Integer returndAmount, Integer allocatableAmount, Integer allocatedAmount,Integer shopStockId) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.depotId = depotId;
		this.remark = remark;
		this.amount = amount;
		this.safeAmount = safeAmount;
		this.lackAmount = lackAmount;
		this.arrangedAmount = arrangedAmount;
		this.lastarrangedDate = lastarrangedDate;
		this.returndAmount = returndAmount;
		this.allocatableAmount = allocatableAmount;
		this.allocatedAmount = allocatedAmount;
		this.shopStockId = shopStockId;
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


	public Integer getDepotId() {
		return depotId;
	}


	public void setDepotId(Integer depotId) {
		this.depotId = depotId;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public Integer getSafeAmount() {
		return safeAmount;
	}


	public void setSafeAmount(Integer safeAmount) {
		this.safeAmount = safeAmount;
	}


	public Integer getLackAmount() {
		return lackAmount;
	}


	public void setLackAmount(Integer lackAmount) {
		this.lackAmount = lackAmount;
	}


	public Integer getArrangedAmount() {
		return arrangedAmount;
	}


	public void setArrangedAmount(Integer arrangedAmount) {
		this.arrangedAmount = arrangedAmount;
	}


	public Date getLastarrangedDate() {
		return lastarrangedDate;
	}


	public void setLastarrangedDate(Date lastarrangedDate) {
		this.lastarrangedDate = lastarrangedDate;
	}


	public Integer getReturndAmount() {
		return returndAmount;
	}


	public void setReturndAmount(Integer returndAmount) {
		this.returndAmount = returndAmount;
	}


	public Integer getAllocatableAmount() {
		return allocatableAmount;
	}


	public void setAllocatableAmount(Integer allocatableAmount) {
		this.allocatableAmount = allocatableAmount;
	}


	public Integer getAllocatedAmount() {
		return allocatedAmount;
	}


	public void setAllocatedAmount(Integer allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}


	@Override
	public String toString() {
		return "ShopStock [shopId=" + shopId + ", shopName=" + shopName + ", depotId=" + depotId + ", remark=" + remark
				+ ", amount=" + amount + ", safeAmount=" + safeAmount + ", lackAmount=" + lackAmount
				+ ", arrangedAmount=" + arrangedAmount + ", lastarrangedDate=" + lastarrangedDate + ", returndAmount="
				+ returndAmount + ", allocatableAmount=" + allocatableAmount + ", allocatedAmount=" + allocatedAmount
				+ ", shopStockId=" + shopStockId + "]";
	}

	
}
