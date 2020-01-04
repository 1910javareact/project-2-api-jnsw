package com.revature.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "thoughts", schema="TopChat")
@Entity
public class Thought {
	@Id
	@Column(name = "thoughtId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int thoughtId;
	
	@Column(name = "thought")
	private String thought;
	
	@Column(name = "boardId")
	private int boardId;
	
	@Column(name = "created")
	private Date created;

	public Thought() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thought(int thoughtId, String thought, int boardId, Date created) {
		super();
		this.thoughtId = thoughtId;
		this.thought = thought;
		this.boardId = boardId;
		this.created = created;
	}

	@Override
	public String toString() {
		return "Thought [thoughtId=" + thoughtId + ", thought=" + thought + ", boardId=" + boardId + ", created="
				+ created + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardId;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((thought == null) ? 0 : thought.hashCode());
		result = prime * result + thoughtId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thought other = (Thought) obj;
		if (boardId != other.boardId)
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (thought == null) {
			if (other.thought != null)
				return false;
		} else if (!thought.equals(other.thought))
			return false;
		if (thoughtId != other.thoughtId)
			return false;
		return true;
	}

	public int getThoughtId() {
		return thoughtId;
	}

	public void setThoughtId(int thoughtId) {
		this.thoughtId = thoughtId;
	}

	public String getThought() {
		return thought;
	}

	public void setThought(String thought) {
		this.thought = thought;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
