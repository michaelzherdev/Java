package org.mzherdev;

import org.mzherdev.dao.HibernateDaoImpl;
import org.mzherdev.dao.JdbcDaoImpl;
import org.mzherdev.dao.SimpleJdbcDaoImpl;
import org.mzherdev.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
////		Circle circle = dao.getCircle(1);
////		System.out.println(circle.getName());
//		
//		System.out.println(dao.getCircleCount());
//		System.out.println(dao.getCircleName(1));
//		System.out.println(dao.getCircleForId(1).getName());
//		
////		dao.insertCircle(new Circle(4, "Third Circle"));
////		System.out.println(dao.getAllCircles().size());
//		
////		dao.createTriangleTable();
//		
//		dao.insertCircle(new Circle(5, "Fifth Circle"));
//		System.out.println(dao.getAllCircles().size());
//		
//		SimpleJdbcDaoImpl daoImpl = context.getBean("simpleJdbcDaoImpl", SimpleJdbcDaoImpl.class);
//		System.out.println(daoImpl.getCircleCount());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = context.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println(dao.getCircleCount());
	}

}
