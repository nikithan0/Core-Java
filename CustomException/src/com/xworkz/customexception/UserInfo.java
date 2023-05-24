package com.xworkz.customexception;

public class UserInfo {
	public static void checkUserInfo(String name, int password)
			throws InvalidUserNameException, InvalidPasswordException {
		if (name != null) {
			System.out.println("The name is valid");
			if (password == 44444667) {
				System.out.println("Checking Password");
				
			}
			throw new InvalidUserNameException("User name is not found");
		}
	
		throw new InvalidPasswordException("The given password is not valid");
	}

	public static void loginInformation(int id, String emailId) throws LoginFailedException, InvalidPasswordException {
		if (id == 4562) {
			System.out.println("Id is valid");
			if (emailId != null) {
				System.out.println("Login successful");
			}
			throw new InvalidPasswordException("Invalid password");

		}
		throw new LoginFailedException("Login failed ");
	}
   
}
