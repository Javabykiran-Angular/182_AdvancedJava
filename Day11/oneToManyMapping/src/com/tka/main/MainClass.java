package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Address;

import com.tka.entity.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(User.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Address addr=new Address("Warje");
		//Address addr1=new Address("Deccan");
		
		List<Address> list=new ArrayList<Address>();
		//list.add(addr1);
		list.add(addr);
		
		User user=new User();
		user.setName("Spruha");
		user.setListAddr(list);
		
		session.persist(addr);
		//session.persist(addr1);
		session.persist(user);

		session.getTransaction().commit();
		session.close();
		
		
		

	}

}
