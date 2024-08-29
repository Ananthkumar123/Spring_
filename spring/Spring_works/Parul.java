package com.spring.Spring_works;

public class Parul {

	product pro;
	student stu;
	Employee emp;
	public Parul(product pro, student stu, Employee emp) {
		super();
		this.pro = pro;
		this.stu = stu;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "parul [pro=" + pro + ", stu=" + stu + ", emp=" + emp + "]";
	}
}
