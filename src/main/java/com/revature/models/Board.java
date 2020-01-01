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
	@Column(name = "board_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardId;
	
	@Column(name = "primary_info")
	private String primartyInfo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "created")
	private Date created;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "topicId", referencedColumnName = "topic_id")
	private Topic topicId;

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(int boardId, String primartyInfo, Date created, Topic topicId) {
		super();
		this.boardId = boardId;
		this.primartyInfo = primartyInfo;
		this.created = created;
		this.topicId = topicId;
	}

	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", primartyInfo=" + primartyInfo + ", created=" + created + ", topicId="
				+ topicId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardId;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((primartyInfo == null) ? 0 : primartyInfo.hashCode());
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
		if (topicId == null) {
			if (other.topicId != null)
				return false;
		} else if (!topicId.equals(other.topicId))
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
}
