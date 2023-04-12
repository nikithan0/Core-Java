package com.xworkz.methodoverriding;


public class Bike extends Vehicle{
	
	public void ride(String name, int milage ) {
		System.out.println(name);
		System.out.println(milage);
		System.out.println("The bike Ride");	
	}
	
	public void travel(String name, int price) {
		System.out.println(name);
		System.out.println(price);
		System.out.println("Travel through bike");
	}
	
	public void consume(String name, int capacity) {
		System.out.println(name);
		System.out.println(capacity);
		System.out.println("Bike cosume petrol");
	}

}
	
