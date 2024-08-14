package com.tka.OrganizationWorkFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.OrganizationWorkFlow.entity.Country;
import com.tka.OrganizationWorkFlow.service.MainService;

@RestController
@RequestMapping("api")
public class MainController {
	
	@Autowired
	MainService service;
	
	@PostMapping("addcountry")
	public String addCountry(@RequestBody Country c) {
		String msg= service.addCountry(c);
		return msg;
	}
	
	@PutMapping("updatecountry/{id}")
	public String updateCountry(@RequestBody Country c,@PathVariable int id) {
		String str= service.updateCountry(c,id);
		return str;
	}
	

}
