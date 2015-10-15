package org.mzherdev;

import org.mzherdev.injection.TriangleInj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = (Triangle) factory.getBean("triangle");
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Triangle triangle = (Triangle) context.getBean("triangle");
//		
//		triangle.draw();
		
		
//		Injecting objects
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		TriangleInj triangle = (TriangleInj) context.getBean("triangleInj");
//		triangle.draw();
//		
////		alias
//		TriangleInj triangle2 = (TriangleInj) context.getBean("triangle-alias");
//		triangle2.draw();
//		
//		TriangleInj triangle3 = (TriangleInj) context.getBean("triangle-col");
//		triangle3.draw();
//		
//		TriangleInj triangle4 = (TriangleInj) context.getBean("triangle-wire");
//		triangle3.draw();
		
//		bean definition
		context.registerShutdownHook(); // with AbstractApplicationContext available
		TriangleInj triangle5 = (TriangleInj) context.getBean("triangle1");
		triangle5.draw();
	}

}
