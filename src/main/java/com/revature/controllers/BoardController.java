package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Board;
import com.revature.models.Make_User_Board;
import com.revature.models.User_Board;
import com.revature.models.makeBoard;
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
	public makeBoard create(@Valid @RequestBody makeBoard input) {
		makeBoard b = bs.save(input);
		return b;
	}
	
	@GetMapping("/view-all-boards")
	public List<Board> view(){
		return bs.getAllBoards();
	}

	@GetMapping("/view-board")
	public makeBoard viewById(@RequestParam int input){
		return bs.getBoardById(input);
	}
	@PostMapping("/save-board")
	public Make_User_Board create(@RequestBody Make_User_Board input) {
		return bs.saveBoard(input);
	}
}
