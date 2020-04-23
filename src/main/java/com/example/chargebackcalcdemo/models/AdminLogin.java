package com.example.chargebackcalcdemo.models;

public class AdminLogin {
	private String adminId;
	private String password;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", password=" + password + "]";
	}

}
