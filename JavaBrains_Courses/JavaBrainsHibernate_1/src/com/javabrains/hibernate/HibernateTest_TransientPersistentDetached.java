package com.javabrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.UserDetails;

public class HibernateTest_TransientPersistentDetached {
	public static void main(String[] args) {
				
		UserDetails user = new UserDetails();
		user.setUserName("Test user");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		
//		session.save(user);
//		
//		user.setUserName("Updated user");
//		user.setUserName("Updated user twice");
		
		for(int i =0; i < 10; i++) {
			user = new UserDetails();
			user.setUserName("User " + i);
			session.save(user);
		}
		
		session.getTransaction().commit();
		session.close();
		
//		user.setUserName("User after session close");
//		session = sessionFactory.openSession();	
//		
//		session.beginTransaction();
//		session.update(user);
//		session.getTransaction().commit();
//		session.close();
	}
}
