package com.spring.interface_object;

public class Bus implements Transport{

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int millage() {
		// TODO Auto-generated method stub
		return 30;
	}


	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 12;
	}
	@Override
	public String toString() {
		return "Bus [name=" + name + ", millage()=" + millage() + ", capacity()="
				+ capacity() + "]";
	}


	 
}
