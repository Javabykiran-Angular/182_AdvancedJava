package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("firstapi")
	public String firstApi() {
		
		System.out.println("Request is Comming at firstApi Method");
		
		return ("My First API is Called...");
		
	}	
	
}
