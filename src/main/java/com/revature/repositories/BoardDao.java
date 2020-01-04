package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Board;

public interface BoardDao extends JpaRepository<Board, Integer>{

	Board findBoardByBoardId(int input);
}
