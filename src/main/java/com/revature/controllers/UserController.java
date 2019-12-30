package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}
}
