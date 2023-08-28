package com.training.prodsvc;

public class Product {
	
	private String ProdId;
	private String product;
	
	public Product(){	
	}
	public Product(String prodId, String product) {
		super();
		ProdId = prodId;
		this.product = product;
	}
	public String getProdId() {
		return ProdId;
	}
	public void setProdId(String prodId) {
		ProdId = prodId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

}
