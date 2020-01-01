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
	private Board board;

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
		result = prime * result + ((board == null) ? 0 : board.hashCode());
		result = prime * result + boardId;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((primartyInfo == null) ? 0 : primartyInfo.hashCode());
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
		if (board == null) {
			if (other.board != null)
				return false;
		} else if (!board.equals(other.board))
			return false;
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
		return true;
	}

	/**
	 * @param boardId
	 * @param primartyInfo
	 * @param created
	 * @param board
	 */
	public Board(int boardId, String primartyInfo, String created, Board board) {
		super();
		this.boardId = boardId;
		this.primartyInfo = primartyInfo;
		this.created = created;
		this.board = board;
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

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", primartyInfo=" + primartyInfo + ", created=" + created + ", board="
				+ board + ", hashCode()=" + hashCode() + ", getBoardId()=" + getBoardId() + ", getPrimartyInfo()="
				+ getPrimartyInfo() + ", getCreated()=" + getCreated() + ", getBoard()=" + getBoard() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	

}