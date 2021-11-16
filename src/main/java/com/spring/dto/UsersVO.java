package com.spring.dto;

import java.util.Date;

public class UsersVO {
	private Long userNumber;
	private String id;
	private String password;
	private String name;
	private String address;
	private String phone;
	private Date regDate;
	
	public UsersVO(){}
	
	public UsersVO(String id,String password)
	{
		this.id = id;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UsersVO [userNumber=" + userNumber + ", id=" + id + ", password=" + password + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", regDate=" + regDate + "]";
	}
	public Long getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}