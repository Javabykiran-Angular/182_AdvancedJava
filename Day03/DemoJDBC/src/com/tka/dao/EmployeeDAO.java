package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tka.entity.Employee;

public class EmployeeDAO {
	
	String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/182Batch";
	String DB_USER = "root";
	String DB_PASSWORD = "Sumit@123";
	
	Connection con=null;
	PreparedStatement pst=null;
	
	
	// Step 1 & 2
	
	public void openDB() {
		
		try {
			Class.forName(DB_DRIVER);
			
			con= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	// Step 3 & 4
	
	public void insertData(Employee emp) {
		String strQuery="insert into employee(name,emailid) values(?,?)";
		
		
		try {
			openDB();
			pst=con.prepareStatement(strQuery);
			
			pst.setString(1,emp.getName());
			pst.setString(2, emp.getEmailid());
			int status = pst.executeUpdate();
			
			if(status>0) {
				System.out.println("Data Addedd Successfully ");
			}else {
				System.out.println("Data is not Addedd Successfully ");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeDB();
		}
		
	}
	
	
	// Setp 5 => Close ALL 
	public void closeDB() {
		try {
			if(con!=null) {
				con.close();
			}
			
			if(pst!=null) {
				pst.close();
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
