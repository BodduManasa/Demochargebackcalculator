package com.example.chargebackcalcdemo.models;

import java.io.Serializable;

public class EmployeeLogin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int empid;
	transient String password;
	public int getEmpid() {
		return empid;
	}
	public void setUserid(int empid) {
		this.empid = empid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeLogin(int empid, String password) {
		super();
		this.empid = empid;
		this.password = password;
	}
	public EmployeeLogin() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeLogin [empid=" + empid + "]";
	}
	

}
