package com.javabrains;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
// single table strategy
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="VEHICLE_TYPE", 
//		discriminatorType=DiscriminatorType.STRING)

//table-per-class strategy
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

// joined strategy
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	@GeneratedValue
//	@GeneratedValue(strategy=GenerationType.TABLE) // for table-per-class strategy
//	@Column(name="vehicleId")
	private int vehicleId;
	private String vehicleName;
	
//	@ManyToOne
	
//	@ManyToOne
//	@JoinColumn(name="USER_ID")
//	private UserDetails user;
	
	@ManyToMany(mappedBy="vehicle")
	private Collection<UserDetails> userList = new ArrayList<UserDetails>();
		
	public int getVehicleId() {
		return vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
//	public UserDetails getUser() {
//		return user;
//	}
//	public void setUser(UserDetails user) {
//		this.user = user;
//	}
	public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}
	
	
}
