package com.tka.OrganizationWorkFlow.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.OrganizationWorkFlow.entity.Country;
import com.tka.OrganizationWorkFlow.entity.Employee;

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

	public String deleteCountry(int cid) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			Country country= session.get(Country.class, cid);
			session.remove(country);
			tx.commit();
			
			msg="Country is Deleted..";
			
			
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

	public List<Country> getAllCountry() {
		Session session=null;
		Transaction tx=null;
		List<Country> list=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			String hqlQuery="from Country";
			
			Query<Country> query= session.createQuery(hqlQuery,Country.class);
			list=query.list();
			tx.commit();
			
			
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
		
		
		return list;
	}

	public Country getparticularCountryById(int cid) {
		Session session=null;
		Transaction tx=null;
		Country country=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			country=session.get(Country.class, cid);
			tx.commit();			
			
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
		
		return country;
	}

	public String addEmployee(Employee emp) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			session.persist(emp);
			tx.commit();
			msg="Employee Added Successfuly";
			
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
	
	

}
