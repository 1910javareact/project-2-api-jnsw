package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.Topic;

public interface TopicDao extends JpaRepository<Topic,Integer>{
	
	@Query("FROM Topic")
	public List<Topic> customMethod(); 

}
