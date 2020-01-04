package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Thought;

public interface ThoughtDao extends JpaRepository<Thought,Integer>{

}
