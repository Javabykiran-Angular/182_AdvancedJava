package com.tka.entity;

import org.springframework.stereotype.Component;

import com.tka.utility.Sim;

@Component
public class Airtel implements Sim {
	

	@Override
	public void calling() {
		
		System.out.println("Airtel Network is Selected For calling");
		
	}

}
