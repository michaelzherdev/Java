package com.javabrains.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.javabrains.UserDetails;

public class HibernateTestHQL {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
//		int userId = 5;
		
//		Query query = session.createQuery("select userName from com.javabrains.UserDetails");
//		query.setFirstResult(5);
//		query.setMaxResults(4);
//		
//		List<String> usersString = (List<String>) query.list();
//		
//		
//		Query query2 = session.createQuery("select max(userId) from com.javabrains.UserDetails");
//		List<Integer> i = (List<Integer>) query2.list();
//		
//		Query query3 = session.createQuery("from com.javabrains.UserDetails where userId > ?"
//				+ "	and userName = :userName");
//		query3.setInteger(0, userId);
//		query3.setString("userName", "User 9");
//		List<UserDetails> list = (List<UserDetails>) query3.list();
		
		
//		namedQuery
//		Query query = session.getNamedQuery("UserDetails.byId");
//		query.setInteger(0, 2);
//		List<UserDetails> usersString = (List<UserDetails>) query.list();
		
//		namedNativeQuery
//		Query query = session.getNamedQuery("UserDetails.byName");
//		query.setString(0, "User 8");
//		
//		List<UserDetails> usersString = (List<UserDetails>) query.list();
		
//		Criteria criteria = session.createCriteria(UserDetails.class);
//		criteria
//				//.add(Restrictions.eq("userName", "User 7"))
//				.add(Restrictions.gt("userId", 2))
//				.add(Restrictions.or(Restrictions.between("userId", 0, 3))
//				.add(Restrictions.between("userId", 6, 9)));
		Criteria criteria = session.createCriteria(UserDetails.class)
//				.setProjection(Projections.property("userId"))
//				.setProjection(Projections.max("userId"))
				.addOrder(Order.desc("userName"));
		
		List<UserDetails> users = (List<UserDetails>) criteria.list();
		
		session.getTransaction().commit();
		session.close();
		
//		for(String u : usersString)
//			System.out.println(u);
			
//		System.out.println("Size of list: " + usersString.size());
		
//		System.out.println(i);
//		
//		for(UserDetails u : list)
//		System.out.println(u.getUserName());
		
		for(UserDetails u : users)
			System.out.println(u.getUserName());
	}

}
