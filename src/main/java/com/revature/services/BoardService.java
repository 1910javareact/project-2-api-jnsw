package com.revature.services;

import java.util.List;

import com.revature.models.Board;

public interface BoardService {
	public Board save(Board input);
	public List<Board> getAllBoards();
	public Board getBoardId();
}
