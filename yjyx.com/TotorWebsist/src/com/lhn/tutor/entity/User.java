package com.lhn.tutor.entity;

public class User {

	private int id;//�û�id
	private String username;//�û���
	private String password;//����

	public User() {
	}

	public User(int id,String username,String password) {
		id=this.id;
		username=this.username;
		password=this.password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}