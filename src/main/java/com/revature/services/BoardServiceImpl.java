package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Board;
import com.revature.models.Make_User_Board;
import com.revature.models.makeBoard;
import com.revature.repositories.BoardDao;
import com.revature.repositories.MakeBoardDao;
import com.revature.repositories.UserBoardDao;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardDao bd;
	private MakeBoardDao md;
	private UserBoardDao ud;
	
	@Autowired
	public BoardServiceImpl(BoardDao bd, MakeBoardDao md, UserBoardDao ud) {
		this.bd = bd;
		this.md = md;
		this.ud = ud;
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
	public makeBoard getBoardById(int input){
		return md.findBoardByBoardId(input);
	}

	@Override
	public Make_User_Board saveBoard(Make_User_Board input) {
		// TODO Auto-generated method stub
		return ud.save(input);
	}

}
