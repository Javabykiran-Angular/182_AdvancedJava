package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		Song song= session.get(Song.class, 2);
		
		song.setArtist("r d burman");
		
		session.merge(song);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
