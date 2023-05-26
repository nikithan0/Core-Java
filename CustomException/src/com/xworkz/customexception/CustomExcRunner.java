package com.xworkz.customexception;

public class CustomExcRunner {

	public static void main(String[] args) {
		try {
			UserInfo.checkUserInfo("Abcd", 78736);	
		}			
		catch (InvalidUserNameException e) {
			e.printStackTrace();
		}
	
	catch(InvalidPasswordException e) {
			
			e.printStackTrace();		
	}
		try {
			UserInfo.loginInformation(1237, "anni@gmail");
		} catch (LoginFailedException e) {
			
			e.printStackTrace();
		} catch (InvalidPasswordException e) {
			
			e.printStackTrace();
		}
		
		
	}
}


