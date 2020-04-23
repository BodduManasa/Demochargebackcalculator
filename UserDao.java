package com.ChargebackCalc.dao;



import java.util.List;



import org.springframework.data.repository.CrudRepository;

import com.ChargebackCalc.model.User;



public interface UserDao extends CrudRepository<User, String> 
{
	
	public User findByUserid(String UserId);
		
	
}
