package com.tka.Demo1MVC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@Column(unique = true)
	String emailid;
	String mobileno;
	
	public Person() {
		
	}
	
	public Person(String name, String emailid, String mobileno) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.mobileno = mobileno;
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
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emailid=" + emailid + ", mobileno=" + mobileno + "]";
	}
	
	
	

}
