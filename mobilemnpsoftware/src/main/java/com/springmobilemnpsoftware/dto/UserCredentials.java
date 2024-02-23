package com.springmobilemnpsoftware.dto;

public class UserCredentials {

	private String mail;
	
	private String password;

	public UserCredentials(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentials [mail=" + mail + ", password=" + password + "]";
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public UserCredentials() {
		// TODO Auto-generated constructor stub
	}
	
}
