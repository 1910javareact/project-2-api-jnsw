package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;
import com.revature.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}
	
	@GetMapping("/login")
	public User findUserByUsernameAndPassword(@RequestParam String username, @RequestParam String password) {
		return us.getUserByUsernameAndPassword(username, password);
	}
}
