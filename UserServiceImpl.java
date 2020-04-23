package com.ChargebackCalc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ChargebackCalc.dao.UserDao;
import com.ChargebackCalc.model.User;
import com.ChargebackCalc.model.UserLogin;

@Service
@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public int createUser(User user) {
		User u = userDao.findByUserid(user.getUserid());
		if (u == null) {
			User u1 = userDao.save(user);
			if (u1 != null) {
				return 1;
			} else {
				return 2;
			}
		}

		return 0;
	}
	@Override
	public int login(UserLogin userlogin) {
		 User u = userDao.findByUserid(userlogin.getUserid());
		 if(u==null)
		 {
		   return 1;
		 }
		 else if(u.getStatus().equals("no"))
		 {
		 	return 2;
		 }
		 else if(u.getPassword().equals(userlogin.getPassword()) && u.getStatus().equals("yes"))
		 {
		 	return 3;
		 }
		 else
		 {
		 return 4;
		 }

	}
         /*if(u!=null)
         {
         	return u.getPassword().equals(userlogin.getPassword());
         }
		
		return false;
	}
*/

	
	

	
	

}
