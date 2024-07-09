package com.tka.test;

import java.util.List;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		List<Employee> list= dao.getAllRecord();
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		

	}

}
