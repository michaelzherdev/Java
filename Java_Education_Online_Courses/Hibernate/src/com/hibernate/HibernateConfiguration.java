package com.hibernate;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
	private static SessionFactory sessionFactory;
	
	private HibernateConfiguration(){}
	
	static{
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		} catch(Throwable e){
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory ;
	}
}
