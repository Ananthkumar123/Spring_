package com.spring.Spring_works;

public class colleage {

	product pro;
	student stu;
	Employee emp;
	 
	 
	public product getPro() {
		return pro;
	}
	public void setPro(product pro) {
		this.pro = pro;
	}
	public student getStu() {
		return stu;
	}
	public void setStu(student stu) {
		this.stu = stu;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "colleage [pro=" + pro + ", stu=" + stu + ", emp=" + emp + "]";
	}
	

}
