package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserDao;

@Service
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
	
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return ud.findUserByUserId(id);
	}

	@Override
	public User insertUser(User input) {
		// TODO Auto-generated method stub
		return ud.insertUser(input);
	}

}
