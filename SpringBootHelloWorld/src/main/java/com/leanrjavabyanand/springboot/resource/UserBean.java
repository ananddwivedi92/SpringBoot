package com.leanrjavabyanand.springboot.resource;

import org.springframework.stereotype.Service;

/**
 * @author Anand
 *
 */
@Service
public class UserBean {

	public UserBean() {

	}

	public UserBean(String userName, String userPassword,String userId) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userId=userId;
	}

	private String userId;
	private String userName;
	private String userPassword;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
}