package com.tka.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();		
		CriteriaBuilder builder= session.getCriteriaBuilder();		
		CriteriaQuery<Song> criteria= builder.createQuery(Song.class);		
		Root<Song> root=criteria.from(Song.class);
		criteria.select(root);		
		Query query= session.createQuery(criteria);
		List<Song> list= query.getResultList();
		session.getTransaction().commit();
		session.close();

		for(Song s:list) {
			System.out.println(s);
		}
		
		
		

	}

}
