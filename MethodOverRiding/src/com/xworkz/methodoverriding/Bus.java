package com.xworkz.methodoverriding;

public class Bus {
	
	public void ride(int busNo, String from) {
		System.out.println(busNo);
		System.out.println(from);
		System.out.println("The method Bus Ride");	
	}
	
	public void travel(int cost, String to) {
		System.out.println(cost);
		System.out.println(to);
		System.out.println("Travel in Bus");
	}
	
	public void consume(int capacity, String fuel) {
		System.out.println(capacity);
		System.out.println(fuel);
		System.out.println("Bus consume fuel");
	}

}
