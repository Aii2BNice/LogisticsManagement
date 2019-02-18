package com.neusoft.ddzx.sgdd.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 调度单 pojo类
 * @author new
 *
 */
public class Allocate {
	private Integer id;
	private Integer orderId;
	private Integer taskId;
	private Integer depotOutId;
	private Integer depoyInId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date depotOutDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date allocateDate;
	private Integer shopId;
	private Integer shopNum;
	public Allocate() {
		super();
	}
	public Allocate(Integer id, Integer orderId, Integer taskId, Integer depotOutId, Integer depoyInId,
			Date depotOutDate, Date allocateDate, Integer shopId, Integer shopNum) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.taskId = taskId;
		this.depotOutId = depotOutId;
		this.depoyInId = depoyInId;
		this.depotOutDate = depotOutDate;
		this.allocateDate = allocateDate;
		this.shopId = shopId;
		this.shopNum = shopNum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getDepotOutId() {
		return depotOutId;
	}
	public void setDepotOutId(Integer depotOutId) {
		this.depotOutId = depotOutId;
	}
	public Integer getDepoyInId() {
		return depoyInId;
	}
	public void setDepoyInId(Integer depoyInId) {
		this.depoyInId = depoyInId;
	}
	public Date getDepotOutDate() {
		return depotOutDate;
	}
	public void setDepotOutDate(Date depotOutDate) {
		this.depotOutDate = depotOutDate;
	}
	public Date getAllocateDate() {
		return allocateDate;
	}
	public void setAllocateDate(Date allocateDate) {
		this.allocateDate = allocateDate;
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
	@Override
	public String toString() {
		return "Allocate [id=" + id + ", orderId=" + orderId + ", taskId=" + taskId + ", depotOutId=" + depotOutId
				+ ", depoyInId=" + depoyInId + ", depotOutDate=" + depotOutDate + ", allocateDate=" + allocateDate
				+ ", shopId=" + shopId + ", shopNum=" + shopNum + "]";
	}
	
}
