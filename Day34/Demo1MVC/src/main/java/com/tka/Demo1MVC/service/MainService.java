package com.tka.Demo1MVC.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Demo1MVC.dao.MainDao;
import com.tka.Demo1MVC.entity.Person;
import com.tka.Demo1MVC.entity.User;

@Service
public class MainService {	
	@Autowired
	MainDao dao;
	public User loginUser(User user) {
		String msg=null;
		User u= dao.loginUser(user);	
		return u;
//		if(Objects.isNull(u)) {
//			msg="login";
//		}else {
//			msg="home";
//		}		
//		return msg;
	}
	
	public List<Person> getAllPersonData() {
		List<Person> list= dao.getAllPersonData();
		return list;
	}
	

}
