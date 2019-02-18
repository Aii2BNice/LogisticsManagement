package com.neusoft.depotmanage.selectform.model;
/**
 * 商品调拨单表的实体类
 * @author new
 *
 */
public class AllocateForm {

	/*
	 * 库房管理模块需要用到的调拨单表中的数据属性（并不是全部）
	 */
	private Integer id;
	private Integer taskId;
	private Integer depotOutId;
	private Integer depotInId;
	private Integer shopId;
	private Integer shopNum;
	private Integer state;
	
	public AllocateForm() {
		super();
	}

	public AllocateForm(Integer id,Integer taskId, Integer depotOutId, Integer depotInId, Integer shopId, Integer shopNum, Integer state) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.depotOutId = depotOutId;
		this.depotInId = depotInId;
		this.shopId = shopId;
		this.shopNum = shopNum;
		this.state = state;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepotOutId() {
		return depotOutId;
	}

	public void setDepotOutId(Integer depotOutId) {
		this.depotOutId = depotOutId;
	}

	public Integer getDepotInId() {
		return depotInId;
	}

	public void setDepotInId(Integer depotInId) {
		this.depotInId = depotInId;
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
		return "AllocateForm [id=" + id + ", taskId=" + taskId + ", depotOutId=" + depotOutId + ", depotInId="
				+ depotInId + ", shopId=" + shopId + ", shopNum=" + shopNum + ", state=" + state + "]";
	}


	
	
}
