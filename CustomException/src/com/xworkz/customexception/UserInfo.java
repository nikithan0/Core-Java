package com.xworkz.customexception;

public class UserInfo {
	public static void checkUserInfo(String name, int password)throws InvalidUserNameException, InvalidPasswordException {
		if (name != null && name.length()>3) {
			System.out.println("The user name is valid");
			if (password == 44444667) {
				System.out.println("Checking Password");
				return;
				
			}
			throw new InvalidPasswordException("The given password is not valid");
			
		}
		throw new InvalidUserNameException("User name is not found");
	}

	public static void loginInformation(int id, String emailId) throws LoginFailedException, InvalidPasswordException {
		if (id >= 1111 ) {
			System.out.println("Id is valid");
			if (emailId != null) {
				System.out.println("Login successful");
				return;
			}
			throw new LoginFailedException("Login failed ");
			
		}
		throw new InvalidPasswordException("Invalid password");

		
	}
   
}
