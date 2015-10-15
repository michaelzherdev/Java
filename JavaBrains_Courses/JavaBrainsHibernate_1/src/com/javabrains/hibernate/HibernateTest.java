package com.javabrains.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.UserDetails;

public class HibernateTest {
	
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
//		user.setUserId(1);
		user.setUserName("First user");
//		user.setAddress("First user address");
//		user.setJoinedDate(new Date());
//		user.setDescription("Description");
		
//		UserDetails user2 = new UserDetails();
//		user2.setUserName("Second user");
		Address addr = new Address();
		addr.setStreet("Street name");
		addr.setCity("City name");
//		user.setHomeAddress(addr);
		
		Address addr2 = new Address();
		addr2.setStreet("Street second name");
		addr2.setCity("City second name");
//		user.setHomeAddress(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
//		user = null;
//		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		user = (UserDetails) session.get(UserDetails.class, 1);
//		System.out.println("User Name retrieves is: " + user.getUserName());
	
	}

}
