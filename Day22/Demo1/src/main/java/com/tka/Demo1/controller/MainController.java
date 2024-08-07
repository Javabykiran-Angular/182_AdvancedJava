package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo1.entity.Employee;

@RestController
public class MainController {
	
//	@RequestMapping("firstapi")
//	public String firstApi() {
//		
//		System.out.println("Request is Comming at firstApi Method");
//		
//		return ("My First API is Called...");
//		
//	}	
	
	@GetMapping("firstapi1")
	public String firstApi() {
		
		System.out.println("Request is Comming at firstApi Method");
		
		return ("My First API is Called...");
		
	}
	
//	@RequestMapping(value = "secondapi",method = RequestMethod.POST)
//	public String secondApi(@RequestBody Employee emp) {
//		System.out.println(emp);
//		return "secondApi is Called....";
//		
//	}
	
	@PostMapping("postrequest")
	public String secondApi(@RequestBody Employee emp) {
		System.out.println(emp);
		return "secondApi is Called....";
		
	}
	
//	@RequestMapping(value = "kuchbhi/{id}",method = RequestMethod.PUT)
//	public String thirdApi(@RequestBody Employee emp,@PathVariable int id) {
//		System.out.println("Id is.. "+id);
//		System.out.println(emp);
//		return "third Api is called";
//	}
	
	@PutMapping("putmapping/{id}")
	public String thirdApi(@RequestBody Employee emp,@PathVariable int id) {
		System.out.println("Id is.. "+id);
		System.out.println(emp);
		return "third Api is called";
	}
	
	
//	@RequestMapping(value = "fourthapi/{id}",method = RequestMethod.DELETE)
//	public String fourthApi(@PathVariable int id) {
//		System.out.println(id);
//		return "Fourth Api is called..";
//	}
	
	@DeleteMapping("deletemapping/{id}")
	public String fourthApi(@PathVariable int id) {
		System.out.println(id);
		return "Fourth Api is called..";
	}
	
	
}
