package com.tka.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Laptop.class);
		config.addAnnotatedClass(Student.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Laptop lapi1=new Laptop("Dell");
		Laptop lapi2=new Laptop("HP");
		Laptop lapi3=new Laptop("Lenevo");
		Laptop lapi4=new Laptop("Asus");
		
	//	Laptop laptopObj= session.get(Laptop.class, 2);
		
		
		List<Laptop> list=new ArrayList<Laptop>();
//		list.add(lapi1);
//		list.add(lapi3);
		
	//	list.add(laptopObj);
		
//		Student stud=new Student();
//		stud.setName("Spruha");
//		stud.setLapiList(list);
		
//		session.persist(lapi1);
//		session.persist(lapi2);
//		session.persist(lapi3);
//		session.persist(lapi4);
		
		//session.persist(stud);
		
		Student sObj= session.get(Student.class, 1);
		List<Laptop> LapiOBJList= sObj.getLapiList();
		
		session.getTransaction().commit();
		session.close();
		
		for(Laptop l:LapiOBJList) {
			System.out.println(l);
		}
		
		
		
		
		
		

	}

}
