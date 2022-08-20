package com.o.model;

import java.sql.Date;

public class UserVO {
	
	private String userId; 		// 유저아이디
	private String userPwd; 	//유저 비밀번호
	private String userName;	//유저 이름
	private String userMail;	//유저 이메일
	private String userAddr1; 	//유저 우편번호
	private String userAddr2; 	//유저 주소
	private String userAddr3; 	//유저 상세주소
	private String adminCk; 	// 유저/매니저 구분하기위해 설정
	private int regDate; 		//등록일자 
	private Date signup_date; 	//회원가입일
	private Date last_join; 	//마지막 접속일
	private String money; 		//유저 잔액
	private String point; 		//유저 포인트
	
	//getters, setters
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	public String getAdminCk() {
		return adminCk;
	}
	public void setAdminCk(String adminCk) {
		this.adminCk = adminCk;
	}
	public int getRegDate() {
		return regDate;
	}
	public void setRegDate(int regDate) {
		this.regDate = regDate;
	}
	public Date getSignup_date() {
		return signup_date;
	}
	public void setSignup_date(Date signup_date) {
		this.signup_date = signup_date;
	}
	public Date getLast_join() {
		return last_join;
	}
	public void setLast_join(Date last_join) {
		this.last_join = last_join;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	
	//toString
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", userMail=" + userMail
				+ ", userAddr1=" + userAddr1 + ", userAddr2=" + userAddr2 + ", userAddr3=" + userAddr3 + ", adminCk="
				+ adminCk + ", regDate=" + regDate + ", signup_date=" + signup_date + ", last_join=" + last_join
				+ ", money=" + money + ", point=" + point + "]";
	}
	
}
