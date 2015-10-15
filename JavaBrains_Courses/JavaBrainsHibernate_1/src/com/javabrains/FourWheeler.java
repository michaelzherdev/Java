package com.javabrains;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//single table strategy
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle {
	
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	
}
