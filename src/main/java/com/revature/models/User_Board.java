package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "user_board", schema="TopChat")
@Entity
@JsonFilter("depth_4")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User_Board implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "user_id")
	private int user_id;
	
	@Id
	@JoinColumn(name = "board_id", referencedColumnName = "boardId")
	@ManyToOne(fetch = FetchType.EAGER)
	private makeBoard board_id;

	public User_Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Board(int user_id, makeBoard board_id) {
		super();
		this.user_id = user_id;
		this.board_id = board_id;
	}

	@Override
	public String toString() {
		return "User_Board";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((board_id == null) ? 0 : board_id.hashCode());
		result = prime * result + user_id;
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
		User_Board other = (User_Board) obj;
		if (board_id == null) {
			if (other.board_id != null)
				return false;
		} else if (!board_id.equals(other.board_id))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public makeBoard getBoard_id() {
		return board_id;
	}

	public void setBoard_id(makeBoard board_id) {
		this.board_id = board_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumns({
//		@JoinColumn(name = "user_id", referencedColumnName = "user_id"),
//		@JoinColumn(name = "board_id", referencedColumnName = "board_id")
//	})
//	private User_Board userBoard;	
	
	
//	

//	@Id
//	@JoinColumn(name = "user_id", referencedColumnName = "userId")
//	private int user_id;
//	
//	@Id
//	@JoinColumn(name = "board_id", referencedColumnName = "boardId")
//	private makeBoard board_id;
	

	
}
