package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.models.Board;
import com.revature.models.Topic;
import com.revature.repositories.TopicDao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TopicServiceImpl implements TopicService {
	
	private TopicDao td;
	
	@Autowired
	public TopicServiceImpl(TopicDao td) {
		this.td = td;
	}

	@Override
	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return td.findAll();
	}
	
//	public HashMap<Board, Topic> getTopicBoards(){
//		return td.getTopicBoards();
//	}

}
