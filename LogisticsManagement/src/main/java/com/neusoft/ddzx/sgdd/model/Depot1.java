package com.neusoft.ddzx.sgdd.model;

public class Depot1 {
	private Integer depotId;
	private String depotName;
	
	public Depot1() {
		super();
	}

	public Depot1(Integer depotId, String depotName) {
		super();
		this.depotId = depotId;
		this.depotName = depotName;
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

	@Override
	public String toString() {
		return "Depot [depotId=" + depotId + ", depotName=" + depotName + "]";
	}
	
}
