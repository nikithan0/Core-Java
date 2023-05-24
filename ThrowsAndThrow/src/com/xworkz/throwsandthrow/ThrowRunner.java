package com.xworkz.throwsandthrow;

public class ThrowRunner {

	public static void main(String[] args) {
         try {
			myMethod4();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println("code.............");

	}
	
	public static void myMethod4() throws ClassNotFoundException {
		int a= 1 - (5);
		if(a!=0) {
			
		throw new ClassNotFoundException("A is 0, so class not found");
		}
	}

}
