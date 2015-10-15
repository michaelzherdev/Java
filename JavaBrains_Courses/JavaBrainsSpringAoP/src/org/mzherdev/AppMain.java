package org.mzherdev;

import org.mzherdev.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = context.getBean("shapeService", ShapeService.class);
//		System.out.println(service.getTriangle().getName());
		System.out.println(service.getCircle().getName());
	}
}
