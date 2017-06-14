package com.spring.jms.sender.api.model;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String name;
	private String address;
	private String emailId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, String address, String emailId) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
	}

}
