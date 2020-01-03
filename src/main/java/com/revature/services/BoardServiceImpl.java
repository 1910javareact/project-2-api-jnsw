package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Board;
import com.revature.models.makeBoard;
import com.revature.repositories.BoardDao;
import com.revature.repositories.MakeBoardDao;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardDao bd;
	private MakeBoardDao md;
	
	@Autowired
	public BoardServiceImpl(BoardDao bd, MakeBoardDao md) {
		this.bd = bd;
		this.md = md;
	}

	@Override
	public makeBoard save(makeBoard input) {
		// TODO Auto-generated method stub
		return md.save(input);
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
