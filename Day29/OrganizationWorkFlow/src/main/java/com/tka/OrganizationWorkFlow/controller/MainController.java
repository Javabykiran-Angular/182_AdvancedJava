package com.tka.OrganizationWorkFlow.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.OrganizationWorkFlow.entity.Country;
import com.tka.OrganizationWorkFlow.entity.Employee;
import com.tka.OrganizationWorkFlow.service.MainService;

@CrossOrigin
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
	
	@DeleteMapping("deletecountry/{cid}")
	public String deleteCountry(@PathVariable int cid) {
		String str= service.deleteCountry(cid);
		return str;
	}
	
	@GetMapping("getallcountry")
	public List<Country> getAllCountry(){
		List<Country> list=service.getAllCountry();
		return list;
	}
	
	@GetMapping("getcountryById/{cid}")
	public Country getparticularCountryById(@PathVariable int cid) {
		Country country= service.getparticularCountryById(cid);
		return country;
	}
	
	@PostMapping("addEmp")
	public String addEmployee(@RequestBody Employee emp) {
		String str= service.addEmployee(emp);
		return str;
	}
	
	@PutMapping("updateEmp/{id}")
	public String updateEmployee(@PathVariable int id,@RequestBody Employee emp) {
		String msg=service.updateEmployee(id,emp);
		return msg;
	}
	
	@DeleteMapping("deleteemp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		String msg=service.deleteEmployee(id);
		return msg;
	}
	
	@GetMapping("getAllEmp")
	public List<Employee> getAllEmployee(){
		List<Employee> list=service.getAllEmployee();
		return list;
	}
	
	@GetMapping("getparticularEmpById/{id}")
	public Employee getParticularById(@PathVariable int id) {
		Employee emp=service.getParticularById(id);
		return emp;
	}
	
	@PostMapping("login")
	public HashMap login(@RequestBody Employee e) {
		HashMap map= service.login(e);
		return map;
	}
	

}
