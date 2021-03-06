package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Thought;
import com.revature.services.ThoughtService;

@RestController
@RequestMapping("thought")
public class ThoughtController {
	private ThoughtService ts;
	
	@Autowired
	public ThoughtController(ThoughtService ts) {
		this.ts = ts;
	}
	
	@GetMapping("/view_thoughts")
	public List<Thought> view(@RequestParam int input) {
		return ts.getThoughts(input);
	}
	
	@PostMapping("/")
	public Thought saveNewThought(@Valid @RequestBody Thought input) {
		return ts.saveNewThought(input);
	}
}
