package com.tka.test;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

public class GetDataByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		Employee emp= dao.getParticularRecord(3);
		System.out.println(emp);

	}

}
