package com.javabrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.UserDetails;

public class HibernateTest4 {
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
//		for(int i = 0 ; i < 10; i++) {
//			UserDetails user = new UserDetails();
//			user.setUserName("User-" + i);
//			session.save(user);
//		}		
		UserDetails user = (UserDetails) session.get(UserDetails.class, 5);
//		session.delete(user);
		
		user.setUserName("Updated user");
		session.update(user);
		
		session.getTransaction().commit();
		session.close();
//		System.out.println(user.getUserName());
	}
}
