package com.test.spring.springboot.vo;

public class Product {

	private String id;
	private String name;
	private float usdPrice;

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

	public float getUsdPrice() {
		return usdPrice;
	}

	public void setUsdPrice(float usdPrice) {
		this.usdPrice = usdPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", usdPrice=" + usdPrice + "]";
	}

}
