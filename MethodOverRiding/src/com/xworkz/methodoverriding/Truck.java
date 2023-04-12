package com.xworkz.methodoverriding;

public class Truck {
	public void ride(String carry, int number) {
		System.out.println(carry);
		System.out.println();
		System.out.println("One can ride the Truck");	
	}
	
	public void travel(String place, int number) {
		System.out.println(place);
		System.out.println(number);
		System.out.println("Can Travel ");
	}
	
	public void consume(String fuel, int capacity) {
		System.out.println(fuel);
		System.out.println(capacity);
		System.out.println("Truck consume fuel");
	}


}
