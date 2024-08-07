package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {
	
	@GetMapping("firstapi1")
	public String firstApi() {		
		System.out.println("Request is Comming at firstApi Method");
		
		return ("In Employee Controller.... My First API is Called...");		
	}

}
