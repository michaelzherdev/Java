package com.javabrains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.javabrains.hibernate.Address;

@Entity(name="USER")
//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="UserDetails.byId", 
	query="from com.javabrains.UserDetails where userId = ?")
//@NamedNativeQuery(name="UserDetails.byName",
//		query="select * from UserDetails where userName = ?",
//		resultClass=UserDetails.class)
@Table(name="UserDetails")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	private String userName;
	
	
//	@OneToOne
//	@JoinColumn(name="VEHICLE_ID")
	
//	@OneToMany
//	@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"),
//			inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	
//	@OneToMany(mappedBy="user")
	
	@ManyToMany
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
	
	

	
//	@ElementCollection(fetch=FetchType.EAGER) // for getters working after session close
//	@JoinTable(name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
//	@GenericGenerator(name="hile-gen", strategy="hilo")
//	@CollectionId(columns = {@Column(name="ADDRESS_ID")}, 
//			generator="hile-gen", type=@Type(type="long"))
//	
//	private Collection<Address> listOfAddress = new ArrayList<Address>();
	
	
//	@Temporal(TemporalType.DATE)
//	private Date joinedDate;
//	@Embedded
//	@AttributeOverrides({
//	@AttributeOverride(name="street",
//				column=@Column(name="HOME_STREET_NAME")),
//	@AttributeOverride(name="city",
//				column=@Column(name="HOME_CITY_NAME")),
//	@AttributeOverride(name="state",
//				column=@Column(name="HOME_STATE_NAME")),
//	@AttributeOverride(name="pincode",
//				column=@Column(name="HOME_PINCODE"))
//	})
//	private Address homeAddress;
//	@Embedded
//	private Address officeAddress;
//	@Transient
//	private String description;
	

	
	public int getUserId() {
		return userId;
	}

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
//
//	public Date getJoinedDate() {
//		return joinedDate;
//	}
//
//	public void setJoinedDate(Date joinedDate) {
//		this.joinedDate = joinedDate;
//	}
//
//	
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Address getHomeAddress() {
//		return homeAddress;
//	}
//
//	public void setHomeAddress(Address homeAddress) {
//		this.homeAddress = homeAddress;
//	}
//
//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}

//	public Collection<Address> getListOfAddress() {
//		return listOfAddress;
//	}
//
//	public void setListOfAddress(Collection<Address> listOfAddress) {
//		this.listOfAddress = listOfAddress;
//	}

	
	
}
