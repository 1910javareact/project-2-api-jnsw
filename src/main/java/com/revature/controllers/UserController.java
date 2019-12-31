package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/login")
	public User login(@RequestParam String username, @RequestParam String password, HttpServletRequest req) {
		User u = us.getUserByUsernameAndPassword(username, password);
		req.getSession().setAttribute("user", u);
		return u;
	}
}
