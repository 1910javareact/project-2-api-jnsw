package com.revature.repositories;

import com.revature.models.User;

public interface UserDao {
	public User findUserByUsernameAndPassword(String username, String password);
}
