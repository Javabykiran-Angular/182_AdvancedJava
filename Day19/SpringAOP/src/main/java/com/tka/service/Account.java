package com.tka.service;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	double amount;
	
	public Account() {}
	
	
	public void deposit() {
		System.out.println("Your deposit method is called....");
	}
	
	public void withdraw() {
		System.out.println("Your Amount is withdraw.....");
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
