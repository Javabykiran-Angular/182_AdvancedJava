package com.tka.DatabaseDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("getall")
	public List<Person> getAllRecord() {
		List<Person> list= service.getAllRecord();
		return list;
	}
	
	@PutMapping("updateperson/{id}")
	public String updateRecord(@PathVariable int id,@RequestBody Person p) {
		String str= service.updateRecord(id,p);
		return str;
	}
	
	
	@DeleteMapping("deleteperson/{id}")
	public String deleteData(@PathVariable int id) {
		String str= service.deleteData(id);
		return str;
	}
	
	
	@GetMapping("particularRecordbyid/{id}")
	public Person getParticularRecordById(@PathVariable int id) {
		Person p= service.getParticularRecordById(id);
		return p;
	}
	
	@GetMapping("particularRecordbyemail/{emailid}")
	public Person getParticularRecordByEmailId(@PathVariable String emailid) {
		Person p=service.getParticularRecordByEmailId(emailid);
		return p;
	}
	
	@PostMapping("login")
	public String loginCheck(@RequestBody Person p) {
		String str= service.loginCheck(p);
		return str;
		
	}
	
	
	
	

}
