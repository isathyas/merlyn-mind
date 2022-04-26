package com.test.spring.springboot.vo;

import java.util.ArrayList;
import java.util.List;

public class Pack {

	private String id;
	private String name;
	private String description;
	private List<Product> products = new ArrayList<Product>();
	private float totalPrice;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Package [id=" + id + ", name=" + name + ", description=" + description + ", products=" + products
				+ ", totalPrice=" + totalPrice + "]";
	}

}
