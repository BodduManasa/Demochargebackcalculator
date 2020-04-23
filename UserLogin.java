package com.ChargebackCalc.model;

import javax.validation.constraints.NotEmpty;

public class UserLogin
{
	@NotEmpty(message = "Not Empty")
	private String userid;
	
	@NotEmpty(message = "Not Empty")
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "UserLogin [userid=" + userid + ", password=" + password + "]";
	}
	
	

}
