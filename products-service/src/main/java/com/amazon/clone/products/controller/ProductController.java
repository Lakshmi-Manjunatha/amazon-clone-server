package com.amazon.clone.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.clone.products.model.Category;
import com.amazon.clone.products.service.ProductService;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {
	
	private ProductService productService;


	@Autowired
	public  ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> getAllCategoriesProducts(){
		List<Category> products = productService.getAllProducts();
		return new ResponseEntity<List<Category>>(products, HttpStatus.OK);
	}
	

}
