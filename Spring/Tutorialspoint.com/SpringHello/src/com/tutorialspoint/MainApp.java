package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
		Hello objA = (Hello)context2.getBean("helloWorld");
		 objA.getMessage1();
	      objA.getMessage2();

	      HelloRussia objB = (HelloRussia) context2.getBean("helloRussia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	}
}
