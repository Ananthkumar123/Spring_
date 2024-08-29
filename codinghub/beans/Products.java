package com.codinghub.beans;

import org.springframework.stereotype.Component;

@Component
public class Products {

	
	int roll;
	String name;

	public Products(){
		System.out.println("iam a ak1 cons");
	}
	public Products(int roll, String name) {
		
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Products [roll=" + roll + ", name=" + name + "]";
	} 

}
