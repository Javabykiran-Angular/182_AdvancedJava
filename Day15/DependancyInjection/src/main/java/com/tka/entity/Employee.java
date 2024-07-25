package com.tka.entity;

public class Employee {
	
	int id;
	String name;
	String mobileno;
	
	Country country;
	
	public Employee() {
		
	}
	
	public Employee(String name, String mobileno) {
		super();
		this.name = name;
		this.mobileno = mobileno;
	}
	
	
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName1(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", country=" + country + "]";
	}
	
	
	
	

}
