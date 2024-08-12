package com.tka.DatabaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.DatabaseDemo.entity.Person;

@Repository
public class PersonDao {
	@Autowired
	SessionFactory factory;
	

	public String savePersonData(Person p) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.getTransaction().commit();
		session.close();
		return "Data is saved...";
	}


	public List<Person> getAllRecord() {
		Session session= factory.openSession();
		String hqlQuery="from Person";
		session.beginTransaction();
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		
		List<Person> list= query.list();
		session.getTransaction().commit();
		session.close();
		return list;
		
	}


	public String updateRecord(int id, Person p) {
	
		Session session= factory.openSession();
		session.beginTransaction();
		Person person= session.get(Person.class, id);
		person.setEmailid(p.getEmailid());
		person.setName(p.getName());
		person.setMobileno(p.getMobileno());
		session.merge(person);
		session.getTransaction().commit();
		session.close();
		return "Record is Updatated...";
		
		
	}


	public String deleteData(int id) {
		Session session= factory.openSession();
		session.beginTransaction();
		Person p= session.get(Person.class, id);
		session.remove(p);
		session.getTransaction().commit();
		session.close();
		return "Record is Deleted....";
		
	}
}
