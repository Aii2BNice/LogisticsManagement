package com.neusoft.depotmanage.depot.model;
/**
 * 实体类：库房信息
 * @author new
 *
 */
public class Depot {

	private Integer depotId;
	private String depotName;
	private String depotAddress;
	private Integer depotLevel;
	
	private Integer adminId;
	
	public Depot() {
		super();
	}
	
	public Depot(Integer depotId, String depotName, String depotAddress, Integer depotLevel, Integer adminId) {
		super();
		this.depotId = depotId;
		this.depotName = depotName;
		this.depotAddress = depotAddress;
		this.depotLevel = depotLevel;
		this.adminId = adminId;
	}

	public Integer getDepotId() {
		return depotId;
	}

	public void setDepotId(Integer depotId) {
		this.depotId = depotId;
	}

	public String getDepotName() {
		return depotName;
	}

	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}

	public String getDepotAddress() {
		return depotAddress;
	}

	public void setDepotAddress(String depotAddress) {
		this.depotAddress = depotAddress;
	}

	public Integer getDepotLevel() {
		return depotLevel;
	}

	public void setDepotLevel(Integer depotLevel) {
		this.depotLevel = depotLevel;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Depot [depotId=" + depotId + ", depotName=" + depotName + ", depotAddress=" + depotAddress
				+ ", depotLevel=" + depotLevel + ", adminId=" + adminId + "]";
	}



	
	
}
