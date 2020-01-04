package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Thought;
import com.revature.repositories.ThoughtDao;

@Service
public class ThoughtServiceImpl implements ThoughtService {
	
	private ThoughtDao tdd;
	
	@Autowired	
	public ThoughtServiceImpl(ThoughtDao tdd) {
		this.tdd = tdd;
	}
	

	@Override
	public Thought saveNewThought(input) {
		// TODO Auto-generated method stub
		return tdd.save(input);
	}
	
}
