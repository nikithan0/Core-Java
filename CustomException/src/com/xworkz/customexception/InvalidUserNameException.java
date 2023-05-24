package com.xworkz.customexception;

public class InvalidUserNameException extends Exception {
	public InvalidUserNameException(){
		
	}
	public InvalidUserNameException(String str) {
		super(str);
	}

}
