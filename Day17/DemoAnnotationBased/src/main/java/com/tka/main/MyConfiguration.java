package com.tka.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.tka.entity.Employee;

@ComponentScan(basePackages = {"com.tka"})
public class MyConfiguration {

//	@Bean
////	@Scope("prototype")
//	public Employee getInstanceOfEmployee(){
//		
//		return (new Employee());
//		
//	}

}
