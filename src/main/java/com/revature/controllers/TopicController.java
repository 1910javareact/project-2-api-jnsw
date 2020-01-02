package com.revature.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Board;
import com.revature.models.Topic;
import com.revature.services.TopicService;

@RestController
@RequestMapping("topic")
public class TopicController {
	private TopicService ts;
	
	@Autowired
	public TopicController(TopicService ts) {
			this.ts = ts;
	}
	
	@GetMapping("/home")
	public List<Topic> homePage() {
		 return ts.getAllTopics();
	}
	
//	@GetMapping("/home/topic-boards")
//	public HashMap<Board,Topic> allTopicBoards(){
//		return ts.getTopicBoards();
//	}
//	
}
