package com.tka.OrganizationWorkFlow.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.OrganizationWorkFlow.entity.Country;

@Repository
public class MainDao {
	
	@Autowired
	SessionFactory factory;

	public String addCountry(Country c) {
		Session session=null;
		Transaction tx=null;
		String msg=null;		
		try {		
		session= factory.openSession();
		tx=session.beginTransaction();
		session.persist(c);
		tx.commit();
		msg="Country Addedd Successfully...";
		}catch (Exception e) {
			// TODO: handle exception
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			
			if(session!=null) {
				session.close();
			}			
		}
		
		return msg;		
		
	}

	public String updateCountry(Country c, int id) {
		
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			
			session=factory.openSession();
			tx=session.beginTransaction();
			Country country= session.get(Country.class, id);
			country.setCname(c.getCname());
			session.merge(country);
			tx.commit();
			msg="Country is Updated";
			
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
		
		return msg;
	}
	
	

}
