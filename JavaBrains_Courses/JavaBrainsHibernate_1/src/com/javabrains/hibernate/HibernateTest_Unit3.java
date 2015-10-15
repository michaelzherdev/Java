package com.javabrains.hibernate;

import java.util.Date;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabrains.FourWheeler;
import com.javabrains.TwoWheeler;
import com.javabrains.UserDetails;
import com.javabrains.Vehicle;

public class HibernateTest_Unit3 {
	
	public static void main(String[] args) {
//		UserDetails user = new UserDetails();
////		user.setUserId(1);
//		user.setUserName("First user");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
//		3 oneToOne
//		user.setVehicle(vehicle);
		
		
//		3 oneToMany
//		user.getVehicle().add(vehicle);
////		
//		Vehicle vehicle2 = new Vehicle();
//		vehicle2.setVehicleName("Jeep");
//		user.getVehicle().add(vehicle2);
////		
////		vehicle.setUser(user);
////		vehicle2.setUser(user);
//		
//		vehicle.getUserList().add(user);
//		vehicle2.getUserList().add(user);
		
		// 4
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porsche");
		car.setSteeringWheel("Porsche Wheel");
		
		
		
		//2
//		Address addr1 = new Address();
//		addr1.setStreet("1 Street");
//		addr1.setCity("1 City");
//		addr1.setState("1 State");
//		addr1.setPincode("20002");
//		
//		Address addr2 = new Address();
//		addr2.setStreet("2 Street");
//		addr2.setCity("2 City");
//		addr2.setState("2 State");
//		addr2.setPincode("20002");
//		
//		user.getListOfAddress().add(addr1);
//		user.getListOfAddress().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
//		session.save(user);
		session.save(vehicle);
		session.save(car);
		session.save(bike);
//		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
		
		//2
//		user = null;
//		
//		session = sessionFactory.openSession();
//		user = (UserDetails) session.get(UserDetails.class, 1);
//		session.close(); // with @ElementCollection(fetch=FetchType.EAGER)
//		System.out.println(user.getListOfAddress().size());
	}

}
