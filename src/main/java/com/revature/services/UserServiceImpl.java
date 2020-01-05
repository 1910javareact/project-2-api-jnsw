package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.models.makeBoard;
import com.revature.repositories.MakeBoardDao;
import com.revature.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	private UserDao ud;
	private MakeBoardDao mbd;
	
	@Autowired
	public UserServiceImpl(UserDao ud, MakeBoardDao mbd) {
		this.ud = ud;
		this.mbd = mbd;
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
	public User save(User input) {
		// TODO Auto-generated method stub
		return ud.save(input);
	}

	@Override
	public List<makeBoard> findBoardById(int id) {
		// TODO Auto-generated method stub
		return mbd.findBoardByUserId(id);
	}

}
