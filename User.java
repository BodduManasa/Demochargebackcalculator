package com.ChargebackCalc.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="user" )
public class User {
    @Column(length = 16)
	private String firstname;
    @Column(length =16)
    private String lastname;
    @Column(length=2)
    private int Age;
    @Column
    private Date dob;
    public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Column
    private String Gender;
    @Column
    @Pattern(regexp = "[6789][0-9]{9}",message = "Invalid Mobile")
	private String contactNumber;
    @Column
    private String City;
    @Column
    private String State;
    @Id
    @NotEmpty(message = "User Name should not  be empty")
	private String userid;
    @Column(nullable =false ,length = 15)
    @NotEmpty(message = "password should not be empty")
	private String password;
    private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   
    
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", Age=" + Age + ", Gender=" + Gender
				+ ", contactNumber=" + contactNumber + ", City=" + City + ", State=" + State + ", userid=" + userid
				+ ", password=" + password + "]";
	} 
  
	
	

	
   
   
	
	
	
	
	
	
	

}
