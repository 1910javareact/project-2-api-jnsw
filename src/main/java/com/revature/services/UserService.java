package com.revature.services;

import java.util.List;

import com.revature.models.User;
import com.revature.models.makeBoard;

public interface UserService {
	public User getUserByUsernameAndPassword(String username, String password);
	
	public User findUserById(int id);

	public User save(User input);

	public List<makeBoard> findBoardById(int id);
}
