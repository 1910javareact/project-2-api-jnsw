package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Make_User_Board;

public interface UserBoardDao extends JpaRepository<Make_User_Board, Integer>{

}
