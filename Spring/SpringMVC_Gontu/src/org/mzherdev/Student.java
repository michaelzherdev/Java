package org.mzherdev;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class Student {
	
	private String studentName;
	@Size(min=2, max=10, message="Please enter a value between 2 and 10 for Hobby!")
	private String studentHobby;
	
	private long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address address) {
		this.studentAddress = address;
	}
		
}
