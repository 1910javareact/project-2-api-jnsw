package com.revature.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Thought;

public interface ThoughtDao extends JpaRepository<Thought, Integer>{

	List<Thought> findThoughtsByBoardId(int input);

	Thought save(String input);
}
