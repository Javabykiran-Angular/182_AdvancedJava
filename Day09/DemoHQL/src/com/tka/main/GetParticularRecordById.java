package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Song;

public class GetParticularRecordById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlquery="from Song where id=:id";
		
		Query<Song> query= session.createQuery(hqlquery,Song.class);
		query.setParameter("id", 4);
		Song song= query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		System.out.println(song);
		

	}

}
