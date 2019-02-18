package com.neusoft.finance.invoicekehuly.model;

public class InvoiceCXKehu {
	private Integer id;
	private Double price;
	
	public InvoiceCXKehu() {
		super();
	}

	public InvoiceCXKehu(Integer id, Double price) {
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
		return "InvoiceCXKehu [id=" + id + ", price=" + price + "]";
	}
	
}
