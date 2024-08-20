package com.tka.OrganizationWorkFlow.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.OrganizationWorkFlow.dao.MainDao;
import com.tka.OrganizationWorkFlow.entity.Country;
import com.tka.OrganizationWorkFlow.entity.Employee;

@Service
public class MainService {
	@Autowired
	MainDao dao;

	public String addCountry(Country c) {
		
		String msg= dao.addCountry(c);
		if(Objects.isNull(msg)) {
			msg="Country is not be addedd";
		}
		return msg;
	}

	public String updateCountry(Country c, int id) {
		String str= dao.updateCountry(c,id);
		if(Objects.isNull(str)) {
			str="Country is not be Updatated";
		}
		return str;
	}

	public String deleteCountry(int cid) {
		String str= dao.deleteCountry(cid);
		if(Objects.isNull(str)) {
			str="Country is not be Deleted";
		}
		return str;
	}

	public List<Country> getAllCountry() {
		List<Country> list=dao.getAllCountry();
		if(Objects.isNull(list)) {
			list=null;
		}
		return list;
	}

	public Country getparticularCountryById(int cid) {
		Country country= dao.getparticularCountryById(cid);
		if(Objects.isNull(country)) {
			country=null;
		}
		return country;
	}

	public String addEmployee(Employee emp) {
		String msg= dao.addEmployee(emp);
		if(Objects.isNull(msg)) {
			msg="Employee is not be addedd";
		}
		return msg;
	}

}
