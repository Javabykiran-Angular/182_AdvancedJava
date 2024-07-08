package com.tka.entity;

public class Employee {
	
	private int id;
	private String name;
	private String emailid;
	
	public Employee() {
		
	}
	
	public Employee(String name, String emailid) {
		super();
		this.name = name;
		this.emailid = emailid;
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
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailid=" + emailid + "]";
	}
	
	
	

}
