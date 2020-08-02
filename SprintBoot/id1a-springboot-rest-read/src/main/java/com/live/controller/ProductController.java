package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.live.entity.Product;

@RestController

public class ProductController {
	List<Product> products = new ArrayList<Product>();
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		if(products.size()==0)
		{
		products.add(new Product(1001, "SpringBoot", "Book", 500.50f));
		products.add(new Product(1002, "SpringBoot2", "Book", 555.50f));
		
		}
		return products;
	}

	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		products.add(product);
		return product;
	}

}
