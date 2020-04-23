package com.ChargebackCalc.services;



import com.ChargebackCalc.model.User;
import com.ChargebackCalc.model.UserLogin;


public interface UserService 
{
	public int createUser(User user);
	public int login(UserLogin userlogin);

}
