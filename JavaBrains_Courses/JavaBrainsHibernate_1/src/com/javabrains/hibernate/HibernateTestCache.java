package com.javabrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.UserDetails;

public class HibernateTestCache {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		
		UserDetails user = (UserDetails) session.get(UserDetails.class, 1);
				
		session.getTransaction().commit();
		session.close();
	}

}
