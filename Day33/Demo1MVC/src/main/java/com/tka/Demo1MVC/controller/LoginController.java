package com.tka.Demo1MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.Demo1MVC.entity.User;

@Controller
@RequestMapping("api")
public class LoginController {
	
	@PostMapping("login")
	public void loginUser(@ModelAttribute User user) {
		System.out.println(user);
	}

}
