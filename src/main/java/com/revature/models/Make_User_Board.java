package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "user_board", schema="TopChat")
@Entity
@IdClass(UserId.class)
public class Make_User_Board implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "user_Id")
	private int user_id;
	
	@Id
	@Column(name = "board_id")
	private int board_id;

	public Make_User_Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Make_User_Board(int user_id, int board_id) {
		super();
		this.user_id = user_id;
		this.board_id = board_id;
	}

	@Override
	public String toString() {
		return "Make_User_Board [user_id=" + user_id + ", board_id=" + board_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + board_id;
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
		Make_User_Board other = (Make_User_Board) obj;
		if (board_id != other.board_id)
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

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
