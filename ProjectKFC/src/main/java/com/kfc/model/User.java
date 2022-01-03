package com.kfc.model;

import java.util.Objects;

public class User {
	private int userId;
	private String userName;
	private String mailId;
	private long mobileNumber;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String mailId, long mobileNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", mailId=" + mailId + ", mobileNumber="
				+ mobileNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mailId, mobileNumber, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(mailId, other.mailId) && mobileNumber == other.mobileNumber && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}

	

}