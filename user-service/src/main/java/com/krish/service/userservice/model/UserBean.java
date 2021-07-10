package com.krish.service.userservice.model;

public class UserBean {
	private String userName;
	private String userId;
	private String userLocation;
	
	public UserBean()
	{
		
	}
	public UserBean(String userName, String userId, String userLocation) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userLocation = userLocation;
	}
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
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	

}
