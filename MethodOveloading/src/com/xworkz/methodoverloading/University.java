package com.xworkz.methodoverloading;

public class University {
	public static void main(String [] args) {
		university(50000,"Banglore");
		
	}
	public static void university() {
		System.out.println("Kuvempu university");
	}
	public static void  university(String name, int fees) {
		System.out.println("Christ university");
	}
	public static void university(int fees, String name) {
		System.out.println("Delhi university");
	}

}
