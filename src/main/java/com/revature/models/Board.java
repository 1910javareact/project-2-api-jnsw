package com.revature.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "board", schema="TopChat")
@Entity
@JsonFilter("depth_4")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Board {
	
	@Id
	@Column(name = "boardId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardId;
	
	@Column(name = "primaryInfo")
	private String primaryInfo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "created")
	private Date created;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "topic", referencedColumnName = "topic_id")
	private Topic topic;
	
	@Column(name="boardName")
	private String boardName;

	/**
	 * 
	 */
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardId;
		result = prime * result + ((boardName == null) ? 0 : boardName.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((primaryInfo == null) ? 0 : primaryInfo.hashCode());
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
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

	/**
	 * @param boardId
	 * @param primaryInfo
	 * @param created
	 * @param topic
	 * @param boardName
	 */
	public Board(int boardId, String primaryInfo, Date created, Topic topic, String boardName) {
		super();
		this.boardId = boardId;
		this.primaryInfo = primaryInfo;
		this.created = created;
		this.topic = topic;
		this.boardName = boardName;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", primaryInfo=" + primaryInfo + ", created=" + created + ", topic="
				+ topic + ", boardName=" + boardName + ", hashCode()=" + hashCode() + ", getBoardId()=" + getBoardId()
				+ ", getPrimaryInfo()=" + getPrimaryInfo() + ", getCreated()=" + getCreated() + ", getTopic()="
				+ getTopic() + ", getBoardName()=" + getBoardName() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
