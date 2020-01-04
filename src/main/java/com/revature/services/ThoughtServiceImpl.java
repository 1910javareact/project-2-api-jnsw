package com.revature.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Thought;
import com.revature.repositories.ThoughtDao;

@Service
public class ThoughtServiceImpl implements ThoughtService {
	private ThoughtDao td;
	
	@Autowired
	public ThoughtServiceImpl(ThoughtDao td) {
		this.td = td;
	}

	@Override
	public List<Thought> getThoughts(int input) {
		// TODO Auto-generated method stub
		return td.findThoughtsByBoardId(input);
	}	

	@Override
	public Thought saveNewThought(Thought input) {
		// TODO Auto-generated method stub
		return td.save(input);
	}
	
}
