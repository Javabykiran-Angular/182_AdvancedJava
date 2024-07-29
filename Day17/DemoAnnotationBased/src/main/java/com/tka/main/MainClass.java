package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.entity.Country;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
//		Employee emp= context.getBean(Employee.class);
		Employee emp= context.getBean("e1", Employee.class);
		System.out.println(emp);
		
//		Employee emp1= context.getBean(Employee.class);
//		System.out.println(emp1);
		
//		Country con= context.getBean(Country.class);
//		System.out.println(con);
//		

	}

}
