package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Board;
import com.revature.services.BoardService;

@RestController
@RequestMapping("board")

public class BoardController {
	private BoardService bs;
	
	@Autowired
	public BoardController(BoardService bs) {
		this.bs = bs;
	}
	
	@PostMapping("/create")
	public Board create(@Valid @RequestBody Board input) {
		Board b = bs.save(input);
		return b;
	}
	
	@GetMapping("/view-all-boards")
	public List<Board> view(){
		return bs.getAllBoards();
	}
}
