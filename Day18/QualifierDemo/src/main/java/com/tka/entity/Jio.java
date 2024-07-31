package com.tka.entity;

import org.springframework.stereotype.Component;

import com.tka.utility.Sim;

@Component
public class Jio implements Sim
{

	@Override
	public void calling() {
		System.out.println("Jio Network is Selected For calling");
		
	}

}
