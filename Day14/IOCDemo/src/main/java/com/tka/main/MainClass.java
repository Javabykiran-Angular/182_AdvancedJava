package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new  ClassPathXmlApplicationContext("spring.xml");
		
//		Employee e1= context.getBean("emp", Employee.class);
		Employee e1= context.getBean(Employee.class); // It returns also object of Employee
		
		System.out.println(e1);
		
		Employee e2= context.getBean("emp", Employee.class);
		System.out.println(e2);
		

	}

}
