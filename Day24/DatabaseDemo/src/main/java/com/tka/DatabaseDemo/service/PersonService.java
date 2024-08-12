package com.tka.DatabaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DatabaseDemo.dao.PersonDao;
import com.tka.DatabaseDemo.entity.Person;

@Service
public class PersonService {
	@Autowired
	PersonDao dao;
	
	public String savePersonData(Person p) {
		String str= dao.savePersonData(p);
		return str;
	}

	public List<Person> getAllRecord() {
		
		List<Person> list= dao.getAllRecord();
		return list;
		
	}

	public String updateRecord(int id, Person p) {
		String str= dao.updateRecord(id,p);
		return str;
		
	}

	public String deleteData(int id) {
		String str= dao.deleteData(id);
		return str;
		
	}

}
