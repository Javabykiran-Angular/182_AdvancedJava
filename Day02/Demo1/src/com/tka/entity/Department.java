package com.tka.entity;

public class Department {
	
	String role;
	
	public Department() {
		
	}

	public Department(String role) {
		super();
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Department [role=" + role + "]";
	}
	

}
