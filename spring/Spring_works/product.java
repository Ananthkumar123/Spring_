package com.spring.Spring_works;

public class product {
	
	String brand;
	String price;
	public product(String brand, String price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [brand=" + brand + ", price=" + price + "]";
	}
	
	
}
