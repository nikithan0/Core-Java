package com.xworkz.customexception;

public class CustomExcRunner {

	public static void main(String[] args) {
		try {
			UserInfo.checkUserInfo("Abc", 78736);	
		}			
		catch (InvalidUserNameException |InvalidPasswordException e) {
			
			e.printStackTrace();		
	}
		try {
			UserInfo.loginInformation(1237, "jwj@ie");
		} catch (LoginFailedException e) {
			
			e.printStackTrace();
		} catch (InvalidPasswordException e) {
			
			e.printStackTrace();
		}
		
		
	}
}


