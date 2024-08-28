package com.tka.Demo1MVC.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Demo1MVC.entity.Person;
import com.tka.Demo1MVC.entity.User;

@Repository
public class MainDao {
	
	@Autowired
	SessionFactory factory;
	public User loginUser(User user) {
		Session session=null;
		Transaction tx=null;
		User u=null;		
		try {
			session= factory.openSession();
			tx=session.beginTransaction();
			String hqlQuery="from User where username=:myusername and password=:mypwd";
			Query<User> query= session.createQuery(hqlQuery,User.class);
			query.setParameter("myusername", user.getUsername());
			query.setParameter("mypwd", user.getPassword());
			u= query.uniqueResult();
			tx.commit();			
			
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
		return u;
	}
	public List<Person> getAllPersonData() {
		Session session=null;
		Transaction tx=null;
		List<Person> list=null;
		try {
			session= factory.openSession();
			tx=session.beginTransaction();
			String hqlquery="from Person";
			Query<Person> query= session.createQuery(hqlquery,Person.class);
			list= query.list();
			tx.commit();
			
			
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return list;
	}

	
	
}
