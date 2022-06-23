package com.test.dto;


public class UserDto {

	private String userId;
	private String userPw;
	private String userNm;
	private String userAddr;
	private String userTel;

	public UserDto() {
		super();
	}
	
	public UserDto(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	public UserDto(String userId, String userPw, String userNm, String userAddr, String userTel) {
		super();

		this.userId = userId;
		this.userPw = userPw;
		this.userNm = userNm;
		this.userAddr = userAddr;
		this.userTel = userTel;
	}

	public UserDto(String userNm, String userAddr, String userTel) {
		super();
		this.userNm = userNm;
		this.userAddr = userAddr;
		this.userTel = userTel;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userPw=" + userPw + ", userNm=" + userNm + ", userAddr=" + userAddr
				+ ", userTel=" + userTel + "]";
	}
	
}
