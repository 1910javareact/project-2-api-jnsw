package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.models.makeBoard;

public interface MakeBoardDao extends JpaRepository<makeBoard, Integer> {

	makeBoard findBoardByBoardId(int input);
	
	@Query("FROM makeBoard WHERE board_id IN (SELECT board_id FROM User_Board WHERE user_id IN :id)")
	List<makeBoard> findBoardByUserId(@Param("id") int id);
}
