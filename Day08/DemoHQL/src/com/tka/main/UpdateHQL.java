package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.tka.entity.Song;

public class UpdateHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="update Song set name=:myname, artist=:myartist  where id=:myid";
		
		MutationQuery mutationquery= session.createMutationQuery(hqlQuery);
		mutationquery.setParameter("myname", "r d burman");
		mutationquery.setParameter("myartist", "mehbooba mehbooba");
		mutationquery.setParameter("myid", 3);
		int status= mutationquery.executeUpdate();
		session.getTransaction().commit();
		session.close();
		if(status>0) {
			System.out.println("Data is Successfully Updatated");
		}else {
			System.out.println("Data is not Successfully Updatated");
		}
		
		
		
		
		

	}

}
