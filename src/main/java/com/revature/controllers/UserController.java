package com.revature.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;
import com.revature.models.makeBoard;
import com.revature.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}
	
	@GetMapping("/{id}")
	public User findUserById(@PathVariable int id) {
		return us.findUserById(id);
	}
	
	@PostMapping("/login")
	public User login(@RequestParam String username, @RequestParam String password, HttpServletRequest req) {
		User u = us.getUserByUsernameAndPassword(username, password);
		req.getSession().setAttribute("user", u);
		return u;
	}
	@PostMapping("/register")
	public User register(@Valid @RequestBody User input) {
		User u = us.save(input);
		return u;
	}
	@GetMapping("/view-saved/{id}")
	public List<makeBoard> findBoardById(@PathVariable int id) {
		return us.findBoardById(id);
	}
}
