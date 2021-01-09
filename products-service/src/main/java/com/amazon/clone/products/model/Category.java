package com.amazon.clone.products.model;

import java.util.List;

public class Category {
	
	private String title;
	private List<SubCategory> subCategories;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

}
