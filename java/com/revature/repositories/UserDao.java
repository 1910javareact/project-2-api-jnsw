package com.revature.repositories;

import com.revature.models.User;
//must extend JPArepo, so it is not using spring data; takes in type of dao, and type of id of dao
//can use @Query for complicated queries
public interface UserDao {
	public User findUserByUsernameAndPassword(String username, String password);
}
