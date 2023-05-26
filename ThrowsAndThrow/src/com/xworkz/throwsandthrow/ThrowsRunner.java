package com.xworkz.throwsandthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class ThrowsRunner {

	public static void main(String[] args) {
		
      try {
		myMethod1();
		
		myMethod3();
	} 
      catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
      System.out.println("rest of the code...");

	}
	
	public static void myMethod() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("c:/D");
	}
	
	public static void myMethod1() throws FileNotFoundException {
		myMethod();
	}
	
	public static void myMethod2() {
		int a = 10/0;
		System.out.println(a);
			
		}
	public static void myMethod3() {
		myMethod2();
	}

}
