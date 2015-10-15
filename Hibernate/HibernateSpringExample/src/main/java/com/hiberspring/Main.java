package com.hiberspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml" }, true);
		StudentDAO studDAO = (StudentDAO) context.getBean("dataDao");
		Student s1 = new Student("Mike", 20l);
		studDAO.save(s1);
		Student s2 = new Student("John", 22l);
		studDAO.save(s2);
		Student s3 = new Student("Jane", 21l);
		studDAO.save(s3);
		System.out.println(studDAO.find("J%").size());
	}

}
