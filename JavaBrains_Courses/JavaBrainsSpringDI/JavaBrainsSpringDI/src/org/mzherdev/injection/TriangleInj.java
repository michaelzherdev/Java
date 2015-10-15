package org.mzherdev.injection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * We'll provide our beans with access to the ApplicationContext object
 * by implementing the ApplicationContextAware interface. We'll also use
 * BeanNameAware interface to get the name of the bean configured
 * in the Spring XML. (to ApplicationContextAware, BeanNameAware)
 */
public class TriangleInj implements Shape
//implements InitializingBean, DisposableBean
//implements ApplicationContextAware, BeanNameAware
{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
//	private ApplicationContext context = null; for ApplicationContextAware, BeanNameAware
	
	private List<Point> points = new ArrayList<Point>();
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public Point getPointA() {
		return pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		System.out.println("Triangle have coordinates: " 
				+ getPointA().getX()  + ", " + getPointA().getY() + "; "
				+ getPointB().getX()  + ", " + getPointB().getY() + "; "
				+ getPointC().getX()  + ", " + getPointC().getY());
		
		for(Point p : points)
			System.out.println("Point: " + p.getX()  + ", " + p.getY());
		}
//
//	@Override
//	public void setApplicationContext(ApplicationContext context)
//			throws BeansException {
//		this.context = context;
//	}
//
//	@Override
//	public void setBeanName(String beanName) {
//		System.out.println("BeanName is " + beanName);
//	}

	
////	for InitializedBean
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for Triangle.");
//	}
//	
////	for DisposableBean
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean init method called for Triangle.");
//	}
//	
	public void myInit() {
		System.out.println("My init method called for Triangle.");
	}
	public void cleanUp() {
		System.out.println("My cleanUp method called for Triangle.");
	}
}
