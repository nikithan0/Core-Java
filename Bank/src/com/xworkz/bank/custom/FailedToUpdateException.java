package com.xworkz.bank.custom;

public class FailedToUpdateException extends Exception{
	public FailedToUpdateException() {
		
	}
	public FailedToUpdateException(String update) {
		super(update);
	}
	

}
