package org.mzherdev;

import java.util.Locale;

import org.mzherdev.injection.Circle;
import org.mzherdev.injection.Shape;
import org.mzherdev.injection.TriangleInj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppBeanProc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanProcessor.xml");
//		TriangleInj triangle = (TriangleInj) context.getBean("triangle");
//		triangle.draw();
//		
//		Circle circle = (Circle) context.getBean("circle");
//		circle.draw();
		
		Shape shape = (Shape) context.getBean("circle"); // or triangle!!
		shape.draw();
		
//		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
	}

}
