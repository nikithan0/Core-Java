package com.xworkz.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileRunner {

	public static void main(String[] args) {
		method1();
//		try {
//			method1();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
  }
		
//	myMethodTwo();
//		try{
//			myMethod();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		//try {
//			myMetohd1();
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//	}
	
	public static void method1()  {
		String str = "ABC";
				if(str == null) {
					throw new NullPointerException("The given reference is null can't find the value");
				}
	}
}
	
//	public static void myMethod()  {
//		int a = 10/0;
//		if(a == 0) {
//			System.out.println(a);
//		}
////	}
//		public static void myMethodTwo() {
//			myMethod();
//		}
//	}
//		
//		System.out.println("code................");

//	}
	
//	public static void myMethod() throws FileNotFoundException {
//		FileInputStream file = new FileInputStream("C:\\Users\\Documents\\html task.txt");
//	}
//	
//	public static void myMetohd1() throws FileNotFoundException {
//		myMethod();
	


