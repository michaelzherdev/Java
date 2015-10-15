package com.tutorialspoints;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans2.xml");

	      Student student = (Student) context.getBean("student2");

	      student.getName();
	      student.getAge();
	      
	   //   student.printThrowException();
	}

}
