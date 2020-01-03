package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Board;
import com.revature.repositories.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardDao bd;
	
	@Autowired
	public BoardServiceImpl(BoardDao bd) {
		this.bd = bd;
	}

	@Override
	public Board save(Board input) {
		// TODO Auto-generated method stub
		return bd.save(input);
	}

	@Override
	public List<Board> getAllBoards() {
		// TODO Auto-generated method stub
		return bd.findAll();
	}

	@Override
	public Board view(Board input){
		return bd.getBoardId(input);
	}

}
