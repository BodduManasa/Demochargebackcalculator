package com.example.chargebackcalcdemo.models;

public class AdminLogin {
private int adminid;
	@Override
public String toString() {
	return "AdminLogin [adminid=" + adminid + ", password=" + password + "]";
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
	private String password;

}
