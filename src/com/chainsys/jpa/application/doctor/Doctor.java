package com.chainsys.jpa.application.doctor;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doctor {
	@Id
	private  int patient_id; 
	private String patient_name;    
	private Date dob;                         
	private String speciality; 
	private String city;                   
	private long phone_No;        
	private float standard_fees; 
	
	
	public int getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}


	public String getPatient_name() {
		return patient_name;
	}


	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhone_No() {
		return phone_No;
	}


	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}


	public float getStandard_fees() {
		return standard_fees;
	}


	public void setStandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}


	 
	
	
	@Override
	public String toString() // Default method
	{
		return String.format("%d, %s, %s, %s, %d, %d",patient_id,patient_name,dob,speciality,city,phone_No);
	}
}
