package com.example.chargebackcalcdemo.models;

public class Admin {
  
  String firstname;
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
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	String lastname;
	int age;
	String gender;
	double mobileno;
	int adminid;
	transient String password;
	public Admin(String firstname, String lastname, int age, String gender, double mobileno, int adminid,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.mobileno = mobileno;
		this.adminid = adminid;
		this.password = password;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender=" + gender
				+ ", mobileno=" + mobileno + ", adminid=" + adminid + "]";
	}
	
	

}
