package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table
@Entity(name = "thought", name="TopChat")
@JsonFilter("depth_4")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Thought {
	@Id
	@Column(name = "thought_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int thoughtId;
	
	@Column(name ="topic_name")
	private String thought;
	
	@Column(name="board_id")
	private String boardId;
	
	@Column(name="created")
	private String created;

	/**
	 * 
	 */
	public Thought() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardId == null) ? 0 : boardId.hashCode());
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
		if (boardId == null) {
			if (other.boardId != null)
				return false;
		} else if (!boardId.equals(other.boardId))
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

	/**
	 * @param thoughtId
	 * @param thought
	 * @param boardId
	 * @param created
	 */
	public Thought(int thoughtId, String thought, String boardId, String created) {
		super();
		this.thoughtId = thoughtId;
		this.thought = thought;
		this.boardId = boardId;
		this.created = created;
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

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Thought [thoughtId=" + thoughtId + ", thought=" + thought + ", boardId=" + boardId + ", created="
				+ created + ", hashCode()=" + hashCode() + ", getThoughtId()=" + getThoughtId() + ", getThought()="
				+ getThought() + ", gjetBoardId()=" + getBoardId() + ", getCreated()=" + getCreated() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
