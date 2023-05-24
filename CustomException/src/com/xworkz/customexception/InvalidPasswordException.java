package com.xworkz.customexception;

public class InvalidPasswordException extends Exception {
	public InvalidPasswordException() {
		
	}
	public InvalidPasswordException(String pass) {
		super(pass);
	}

}
