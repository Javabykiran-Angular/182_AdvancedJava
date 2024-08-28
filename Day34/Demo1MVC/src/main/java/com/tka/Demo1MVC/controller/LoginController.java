package com.tka.Demo1MVC.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.Demo1MVC.entity.Person;
import com.tka.Demo1MVC.entity.User;
import com.tka.Demo1MVC.service.MainService;

@Controller
@RequestMapping("api")
public class LoginController {
	@Autowired
	MainService service;	
	@PostMapping("login")
	public String loginUser(@ModelAttribute User user, Model model) {
		System.out.println(user);		
		User u=service.loginUser(user);
		String msg=null;
		if(Objects.isNull(u)) {
			msg="login";
		}else{
			List<Person> list= service.getAllPersonData();
			for (Person person : list) {
				System.out.println(person);
			}
			model.addAttribute("personlist", list);
			msg="home";
		}
		
//		System.out.println(msg);
		
		return msg;
	}

}
