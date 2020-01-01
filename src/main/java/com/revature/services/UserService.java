package com.revature.services;

import com.revature.models.User;

public interface UserService {
	public User getUserByUsernameAndPassword(String username, String password);
	
	public User findUserById(int id);

	public User save(User input);
}
