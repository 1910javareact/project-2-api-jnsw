package com.revature.models;

import java.io.Serializable;

public class UserId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int user_id;
	private int board_id;
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
}
