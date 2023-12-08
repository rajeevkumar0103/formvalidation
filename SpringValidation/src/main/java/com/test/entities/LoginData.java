package com.test.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

	
	@NotBlank(message="User Name can not be empty")
	@Size(min=3,max=15,message="User Name must be between 3-15 characters")
	private String userName;
	
	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Invalid Email ")
	private String email;
	
	@AssertTrue(message="must agree terms and conditions")
	private boolean agreed;
	
	
	
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginData(
			@NotBlank(message = "User Name can not be empty") @Size(min = 3, max = 15, message = "User Name must be between 3-15 characters") String userName,
			@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email ") String email,
			@AssertTrue boolean agreed) {
		super();
		this.userName = userName;
		this.email = email;
		this.agreed = agreed;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
	}
	
	
}
