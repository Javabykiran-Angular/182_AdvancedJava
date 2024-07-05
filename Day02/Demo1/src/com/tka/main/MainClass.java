package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.MainDAO;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee("Sumit",50000,"sumit@gmail.com","7972547618","DevOps");
		
		Employee emp2=new Employee("Kiran",60000,"kiran@gmail.com","9960556397","Marketing");
		
		Employee emp3=new Employee("Spruha",60000,"kiran@gmail.com","9960556397","Marketing");
		
//		System.out.println(emp);
		
		MainDAO dao=new MainDAO();
		//dao.display(emp1);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		//dao.getData(list);
		
		List<Employee> emplist=dao.returnEmpList(emp1, emp2, emp3);
		
		for(Employee e:emplist) {
			System.out.println(e);
		}

	}

}
