package com.tka.OrganizationWorkFlow.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String mobileno;
	@Column(unique = true)
	String emailid;
	double salary;
	String department;
	String status;
	String createdBy;
	Date ceratedDate;
	String updatedBy;
	Date updatedDate;
	
	@ManyToOne
	@JoinColumn(name = "c_id")
	Country country;

}
