package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "board", schema="TopChat")
@Entity
public class Board {
	
	@Id
	@Column(name = "board_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardId;
	
	@Column(name = "primary_info")
	private String primartyInfo;
	
	@Column(name = "created")
	private String created;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "topic", referencedColumnName = "topic_id")
	private Topic topic;

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(int boardId, String primartyInfo, String created, Topic topic) {
		super();
		this.boardId = boardId;
		this.primartyInfo = primartyInfo;
		this.created = created;
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", primartyInfo=" + primartyInfo + ", created=" + created + ", topic="
				+ topic + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardId;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((primartyInfo == null) ? 0 : primartyInfo.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		Board other = (Board) obj;
		if (boardId != other.boardId)
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (primartyInfo == null) {
			if (other.primartyInfo != null)
				return false;
		} else if (!primartyInfo.equals(other.primartyInfo))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getPrimartyInfo() {
		return primartyInfo;
	}

	public void setPrimartyInfo(String primartyInfo) {
		this.primartyInfo = primartyInfo;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
