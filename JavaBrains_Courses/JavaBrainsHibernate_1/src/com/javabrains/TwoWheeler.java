package com.javabrains;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//single table strategy
//@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle {
	
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
	

}
