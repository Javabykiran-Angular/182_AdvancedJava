package com.tka.DatabaseDemo.service;

import java.util.List;
import java.util.Objects;

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

	public Person getParticularRecordById(int id) {
		Person p= dao.getParticularRecordById(id);
		return p;
		
	}

	public Person getParticularRecordByEmailId(String emailid) {
		 Person p= dao.getParticularRecordByEmailId(emailid);
		return p;
	}

	public String loginCheck(Person p) {
		String msg=null;
		Person person= dao.loginCheck(p);
		if(Objects.isNull(person)) {
			msg="Invalid User";
		}else {
			msg="Valid User";
		}
		return msg;
		
	}

}
