package com.revature.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "board", schema="TopChat")
@Entity
public class makeBoard {

	@Id
	@Column(name = "boardId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardId;
	
	@Column(name = "primaryInfo")
	private String primaryInfo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "created")
	private Date created;
	
	@Column(name = "topic")
	private int topic;
	
	@Column(name="boardName")
	private String boardName;

	public makeBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public makeBoard(int boardId, String primaryInfo, Date created, int topic, String boardName) {
		super();
		this.boardId = boardId;
		this.primaryInfo = primaryInfo;
		this.created = created;
		this.topic = topic;
		this.boardName = boardName;
	}

	@Override
	public String toString() {
		return "makeBoard [boardId=" + boardId + ", primaryInfo=" + primaryInfo + ", created=" + created + ", topic="
				+ topic + ", boardName=" + boardName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardId;
		result = prime * result + ((boardName == null) ? 0 : boardName.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((primaryInfo == null) ? 0 : primaryInfo.hashCode());
		result = prime * result + topic;
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
		makeBoard other = (makeBoard) obj;
		if (boardId != other.boardId)
			return false;
		if (boardName == null) {
			if (other.boardName != null)
				return false;
		} else if (!boardName.equals(other.boardName))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (primaryInfo == null) {
			if (other.primaryInfo != null)
				return false;
		} else if (!primaryInfo.equals(other.primaryInfo))
			return false;
		if (topic != other.topic)
			return false;
		return true;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getPrimaryInfo() {
		return primaryInfo;
	}

	public void setPrimaryInfo(String primaryInfo) {
		this.primaryInfo = primaryInfo;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public int getTopic() {
		return topic;
	}

	public void setTopic(int topic) {
		this.topic = topic;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	
}
