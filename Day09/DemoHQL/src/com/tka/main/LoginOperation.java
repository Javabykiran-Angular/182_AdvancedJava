package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class LoginOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="from Song where name=:myname and id=:myid";
		
		Query<Song> query= session.createQuery(hqlQuery,Song.class);
		query.setParameter("myid", 41);
		query.setParameter("myname", "Kesariya Kesariya...");
		Song song= query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		if(song!=null) {
			System.out.println("Login Successfully");
			
		}else {
			System.out.println("Invalid User");
		}
		
		
		
	}

}
