package com.tka.test;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		Employee emp=new Employee("SUmit Raokhande", "sumit@gmail.com");
		dao.insertData(emp);
		

	}

}
