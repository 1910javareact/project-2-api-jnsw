package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.User;

public interface UserDao extends JpaRepository<User, Integer>{
	@Query("FROM User")
	public User findUserByUsernameAndPassword(String username, String password);
}
