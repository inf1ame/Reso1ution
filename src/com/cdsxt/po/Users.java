package com.cdsxt.po;

public class Users {
	public Users() {
		super();
	}
	public Users(Integer id, String name, String pwd, String email) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
	}
	private Integer id;
	private String name;
	private String pwd;
	private String email;
	@Override
	public String toString() {
		return "{\"id:\"=" + id + ",\" name\":\"" + name + "\", \"pwd\":\"" + pwd
				+ "\",\"email\":\"" + email+"\"}";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
