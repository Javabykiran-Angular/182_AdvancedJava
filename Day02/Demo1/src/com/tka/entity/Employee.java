package com.tka.entity;

public class Employee {
	
	String name;
	int id;
	double salary;
	String emailId;
	String mobileno;
	Department dept;
	
	public Employee() {
		
	}
	
	
	public Employee(String name, double salary, String emailId, String mobileno,String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.emailId = emailId;
		this.mobileno = mobileno;
		this.dept=new Department(role);
	}
	
	
	
	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", emailId=" + emailId + ", mobileno="
				+ mobileno + ", dept=" + dept + "]";
	}


	
	
	
	
	

}
