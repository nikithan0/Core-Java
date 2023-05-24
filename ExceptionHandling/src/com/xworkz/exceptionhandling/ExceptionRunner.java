package com.xworkz.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner {

	public static void main(String[] args) {
	//	int i = 0;
	//	int b = 10/i;
		
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Documents\\App.text");
			System.out.println("Hello");
			Class.forName("h");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("File not found but handled");
		}
		catch(ClassNotFoundException exc) {
			exc.printStackTrace();
			System.out.println("Classnot found ");
		}
		
		System.out.println("Print world");

	}

}
