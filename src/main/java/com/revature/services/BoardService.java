package com.revature.services;

import java.util.List;

import javax.validation.Valid;

import com.revature.models.Board;
import com.revature.models.Make_User_Board;
import com.revature.models.makeBoard;

public interface BoardService {
	public makeBoard save(@Valid makeBoard input);
	public List<Board> getAllBoards();
	public makeBoard getBoardById(int input);
	public Make_User_Board saveBoard(Make_User_Board input);
}
