package com.example.chargebackcalcdemo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee")

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column
	String firstname;
	@Column
	String laststname;
	@Column
	int age;
	@Column
	String gender;
	@Column
	long Contactnumber;
	@Column
	String city;
	@Column
	String state;
	@Id
	@Column
	int empid;
	@Column
	transient String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLaststname() {
		return laststname;
	}
	public void setLaststname(String laststname) {
		this.laststname = laststname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactnumber() {
		return Contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		Contactnumber = contactnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(String firstname, String laststname, int age, String gender, long contactnumber, String city,
			String state, int empid, String password) {
		super();
		this.firstname = firstname;
		this.laststname = laststname;
		this.age = age;
		this.gender = gender;
		Contactnumber = contactnumber;
		this.city = city;
		this.state = state;
		this.empid = empid;
		this.password = password;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", laststname=" + laststname + ", age=" + age + ", gender=" + gender
				+ ", Contactnumber=" + Contactnumber + ", city=" + city + ", state=" + state + ", empid=" + empid
				+ "]";
	}
	
	
	

}
