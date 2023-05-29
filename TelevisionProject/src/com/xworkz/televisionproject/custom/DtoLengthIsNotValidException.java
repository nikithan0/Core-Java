package com.xworkz.televisionproject.custom;

public class DtoLengthIsNotValidException extends Exception{
	
	public DtoLengthIsNotValidException() {
		
	}
	
	public DtoLengthIsNotValidException(String length) {
		super(length);
	}

}
