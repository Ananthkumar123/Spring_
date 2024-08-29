package com.spring.Spring_works;

public class student {

	int id ;
	String name ;
	String department;
	public student(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}
