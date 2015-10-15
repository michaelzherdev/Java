package org.mzherdev.injection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.mzherdev.event.DrawEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//stereotype annotation
//@Component @Service @Controller @Repository
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
//	Using MessageSource To Get Text From Property Files
	@Autowired
	private MessageSource messageSource;
//	Event Handling in Spring
	private ApplicationEventPublisher publisher;

	@Override
	public void draw() {
//		System.out.println("Drawing circle");
		System.out.println(this.messageSource.getMessage("drawing", null, "Default Drawing", null));
		System.out.println(this.messageSource.getMessage("drawingPoint", new Object[] {center.getX(), center.getY()}, "Default DrawingPoint", null));
//		System.out.println("Point is: " + getCenter().getX() + ", " + getCenter().getY());
//		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		
//		Event Handling in Spring
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	public Point getCenter() {
		return center;
	}

	// if value in *.xml is not setted annotation is needed to control it
//	@Required
//	@Autowired
	
	@Resource(name="pointC" )
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroying of circle");
	}
	
//	Using MessageSource To Get Text From Property Files
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

//	Event Handling in Spring
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	
}
