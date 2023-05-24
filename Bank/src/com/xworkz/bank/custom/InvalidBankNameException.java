package com.xworkz.bank.custom;

public class InvalidBankNameException extends Exception {
	public InvalidBankNameException() {
		
	}
	public InvalidBankNameException(String message) {
		super(message);
	}

}
