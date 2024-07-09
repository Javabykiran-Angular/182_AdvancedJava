package com.tka.test;

import com.tka.dao.EmployeeDAO;

public class DeleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		int status= dao.deleteRecord(1);
		
		if(status>0) {
			System.out.println("Record is deleted Successfully...");
		}else {
			System.out.println("Record is not deleted Successfully...");
		}

	}

}
