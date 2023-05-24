package com.xworkz.customexception;

public class LoginFailedException extends Exception {
	public LoginFailedException() {
	}
	
	public LoginFailedException(String message) {
		super(message);
	}

}
