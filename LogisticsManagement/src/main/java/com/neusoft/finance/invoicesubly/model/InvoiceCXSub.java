package com.neusoft.finance.invoicesubly.model;

/**
 * @author new
 *
 */
public class InvoiceCXSub {
	private Integer id;
	private Double price;
	public InvoiceCXSub() {
		super();
	}
	public InvoiceCXSub(Integer id, Double price) {
		super();
		this.id = id;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "InvoiceCXSub [id=" + id + ", price=" + price + "]";
	}
	
}
