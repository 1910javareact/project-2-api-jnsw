package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.makeBoard;

public interface MakeBoardDao extends JpaRepository<makeBoard, Integer> {

}
