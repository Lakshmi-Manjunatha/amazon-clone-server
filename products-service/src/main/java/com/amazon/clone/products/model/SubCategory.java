package com.amazon.clone.products.model;

import java.util.List;

public class SubCategory {
	
	private String type;
	private String subcatAvatar;
	private List<Product> products;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubcatAvatar() {
		return subcatAvatar;
	}
	public void setSubcatAvatar(String subcatAvatar) {
		this.subcatAvatar = subcatAvatar;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
