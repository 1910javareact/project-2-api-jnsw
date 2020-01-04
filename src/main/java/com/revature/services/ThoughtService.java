package com.revature.services;

import java.util.List;
import com.revature.models.Thought;

public interface ThoughtService {
	public List<Thought> getThoughts(int input);

	public Thought saveNewThought(Thought input); 
}
