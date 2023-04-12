package com.xworkz.methodoverriding;

public class Vehicle {
	
	public void ride(int a , int b) {
		System.out.println(a+b);
		System.out.println("Having method Ride");	
	}
	
	public void travel(int a, int b) {
		System.out.println(a-b);
		System.out.println("Having method travel");
	}
	
	public void consume(int a, int b) {
		System.out.println(a*b);
		System.out.println("Vehicle cosume petrol");
	}
	


}
