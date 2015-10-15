package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
			      new ClassPathXmlApplicationContext("Beans.xml");
		CustomEventPublisher customEventPublisher = (CustomEventPublisher)context.getBean("customEventPublisher");
		customEventPublisher.publish();
		customEventPublisher.publish();
	}

}
