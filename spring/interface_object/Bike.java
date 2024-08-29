package com.spring.interface_object;

public class Bike {

	
	String b_name;
	String b_price;
	String b_milleage;
	
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_price() {
		return b_price;
	}
	public void setB_price(String b_price) {
		this.b_price = b_price;
	}
	public String getB_milleage() {
		return b_milleage;
	}
	public void setB_milleage(String b_milleage) {
		this.b_milleage = b_milleage;
	}
	@Override
	public String toString() {
		return "Bike [b_name=" + b_name + ", b_price=" + b_price + ", b_milleage=" + b_milleage + "]";
	}
	
}
