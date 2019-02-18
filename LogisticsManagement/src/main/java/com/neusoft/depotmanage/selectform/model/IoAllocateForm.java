package com.neusoft.depotmanage.selectform.model;
/**
 * ���˻���������ʵ����
 * @author new
 *
 */
public class IoAllocateForm {

	/*
	 * �ⷿ����ģ����Ҫ�õ��ĵ��������е��������ԣ�������ȫ����
	 */
	private Integer allocateId;
	private Integer productId;
	private Integer productCount;
	private Integer type;
	
	public IoAllocateForm() {
		super();
	}

	public IoAllocateForm(Integer allocateId, Integer productId, Integer productCount, Integer type) {
		super();
		this.allocateId = allocateId;
		this.productId = productId;
		this.productCount = productCount;
		this.type = type;
	}

	public Integer getAllocateId() {
		return allocateId;
	}

	public void setAllocateId(Integer allocateId) {
		this.allocateId = allocateId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "IoAllocateForm [allocateId=" + allocateId + ", productId=" + productId + ", productCount="
				+ productCount + ", type=" + type + "]";
	}
	
	
}
