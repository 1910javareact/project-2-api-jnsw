package com.revature.services;

import java.util.List;

import com.revature.models.Board;
import com.revature.models.makeBoard;

public interface BoardService {
	public makeBoard save(makeBoard input);
	public List<Board> getAllBoards();
	public Board getBoardId();
}
