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

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "board", schema="TopChat")
@Entity
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
	@JoinColumn(name = "topicId", referencedColumnName = "topic_id")
	private Topic topicId;
	
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
		result = prime * result + ((topicId == null) ? 0 : topicId.hashCode());
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
		if (topicId == null) {
			if (other.topicId != null)
				return false;
		} else if (!topicId.equals(other.topicId))
			return false;
		return true;
	}

	/**
	 * @param boardId
	 * @param primaryInfo
	 * @param created
	 * @param topicId
	 * @param boardName
	 */
	public Board(int boardId, String primaryInfo, Date created, Topic topicId, String boardName) {
		super();
		this.boardId = boardId;
		this.primaryInfo = primaryInfo;
		this.created = created;
		this.topicId = topicId;
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

	public Topic getTopicId() {
		return topicId;
	}

	public void setTopicId(Topic topicId) {
		this.topicId = topicId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", primaryInfo=" + primaryInfo + ", created=" + created + ", topicId="
				+ topicId + ", boardName=" + boardName + ", hashCode()=" + hashCode() + ", getBoardId()=" + getBoardId()
				+ ", getPrimaryInfo()=" + getPrimaryInfo() + ", getCreated()=" + getCreated() + ", getTopicId()="
				+ getTopicId() + ", getBoardName()=" + getBoardName() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
}
