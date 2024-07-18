package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.tka.entity.Laptop1;

import com.tka.entity.Student1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Laptop1.class);
		config.addAnnotatedClass(Student1.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		Laptop1 lapi1=new Laptop1("Dell");
		Laptop1 lapi2=new Laptop1("HP");
		Laptop1 lapi3=new Laptop1("Accer");
		Laptop1 lapi4=new Laptop1("Asus");
		Laptop1 lapi5=new Laptop1("Lenevo");
		Laptop1 lapi6=new Laptop1("Apple");
		
//		session.persist(lapi1);
//		session.persist(lapi2);
//		session.persist(lapi3);
//		session.persist(lapi4);
//		session.persist(lapi5);
//		session.persist(lapi6);
		
		Laptop1 delllapi=session.get(Laptop1.class, 3);
		Student1 stud=new Student1();
		stud.setName("Kiran");
		stud.setLaptop(delllapi);
		
		session.persist(stud);
		
		session.getTransaction().commit();
		session.close();		
		
		

	}

}
