package com.example.chargebackcalcdemo.models;

import java.io.Serializable;

public class AdminLogin implements Serializable {

	private static final long serialVersionUID = 1L;
	int adminid;
	transient String password;
	
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

	public AdminLogin(int adminid, String password) {
		super();
		this.adminid = adminid;
		this.password = password;
	}

	public AdminLogin() {
		super();
	}

	@Override
	public String toString() {
		return "AdminLogin [adminid=" + adminid + "]";
	}
	
}
