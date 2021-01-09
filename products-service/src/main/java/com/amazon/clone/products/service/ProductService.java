package com.amazon.clone.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.amazon.clone.products.model.Category;
import com.amazon.clone.products.model.Product;
import com.amazon.clone.products.model.SubCategory;

@Component
public class ProductService {

	public List<Category> getAllProducts() {
		return buildProducts();
	}

	private List<Category> buildProducts() {
		List<Category> categories = new ArrayList<Category>();
		Category category = new Category();
		category.setTitle("Wardrobe");
		category.setSubCategories(getSubCategories());
		categories.add(category);
		return categories;
	}

	private List<SubCategory> getSubCategories() {
		List<SubCategory> categories = new ArrayList<SubCategory>();
		SubCategory subCategory = new SubCategory();
		subCategory.setSubcatAvatar("https://images-eu.ssl-images-amazon.com/images/G/31/Gateway/BrightBuy/Mens_fashion_186x116._SY116_CB426138153_.jpg");
		subCategory.setType("Men's Fashion");
		subCategory.setProducts(getProducts());
		categories.add(subCategory);
		return categories;
	}

	private List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product product = new Product();
		product.setAvatarUrl("https://m.media-amazon.com/images/I/A1gtkzQtJWL._AC_UL320_.jpg");
		product.setPrice("449");
		product.setTitle("Amazon Brand -Symbol XXX");
		product.setRating("4");
		products.add(product);
		return products;
	}

}
