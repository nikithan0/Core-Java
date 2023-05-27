package com.xworkz.exceptionhandling1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner {

	public static void main(String[] args) {
	
		try {
			FileInputStream file = new FileInputStream("c:/Dmsg");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("rest of the code...");
		

	}

}
