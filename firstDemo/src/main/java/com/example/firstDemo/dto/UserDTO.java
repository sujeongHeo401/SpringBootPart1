package com.example.firstDemo.dto;

public class UserDTO {
	
	private String userName;
	private String userId;
	private String userPhone;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", userId=" + userId + ", userPhone=" + userPhone + "]";
	}
	
	
	
	
	

}
