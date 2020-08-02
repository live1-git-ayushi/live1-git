package com.live.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.*;


public class Product {

	private long productId;
	private String productName;
	private String productDescription;
	private float price;
	public Product() {
		super();
	}
	
	public Product(long productId, String productName, String productDescription, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public Long getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price + "]";
	}
}
