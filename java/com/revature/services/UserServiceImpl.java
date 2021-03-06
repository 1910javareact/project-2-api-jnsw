package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.User;
import com.revature.repositories.UserDao;

public class UserServiceImpl implements UserService{
	
	private UserDao ud;
	
	@Autowired
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return ud.findUserByUsernameAndPassword(username, password);
	}

}
