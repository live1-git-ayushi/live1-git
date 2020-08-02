package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
//create a product
	@PostMapping("/products")
	  public void createProduct(@RequestBody Product product) {
	  products.add(product); 
	  }
	 
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(value="id") long productId, @RequestBody Product product) {
		Product productvar=null;
		for(Product product1:products)
		{
			if(product1.getProductId()==productId)
			{
				product1.setProductName(product.getProductName());
				product1.setProductDescription(product.getProductDescription());
				product1.setPrice(product.getPrice());
				productvar=product1;
				break;
			}
		}
		
		return productvar;
	}
	@DeleteMapping("/products/{id}")
	public Product deleteProduct(@PathVariable(value="id") long productId) {
		Product productvar=null;
		int index=-1;
		for(Product product1:products)
		{
			index++;
			if(product1.getProductId()==productId)
			{
				
				products.remove(index);
				break;
			}
		}
		
		return productvar;
	}
}
