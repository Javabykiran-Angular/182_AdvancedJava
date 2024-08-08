package com.tka.DatabaseDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DatabaseDemo.entity.Person;
import com.tka.DatabaseDemo.service.PersonService;

@RestController
@RequestMapping("api")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@PostMapping("person")
	public String savePersonData(@RequestBody Person p) {
		//System.out.println(p);
		String str= service.savePersonData(p);
		return str;
	}

}
