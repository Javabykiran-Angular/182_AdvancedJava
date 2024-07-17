package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;

public class OneToOneMain {

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
		Laptop lapi2=new Laptop("Hp");
		Laptop lapi3=new Laptop("Accer");
		Laptop lapi4=new Laptop("Macbook");
		
		Student stud=new Student();
		stud.setName("Spruha");
		
		Laptop macLapi= session.get(Laptop.class, 4);
		stud.setLaptop(macLapi);
		
		//stud.setLaptop(lapi1);
		
//		session.persist(lapi1);
//		session.persist(lapi2);
//		session.persist(lapi3);
//		session.persist(lapi4);
		
		session.persist(stud);
		
		session.getTransaction().commit();
		session.close();
		
		
		

	}

}
