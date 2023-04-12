package com.xworkz.methodoverriding;

public class Auto {
	
	public void ride(int wheelNo, int price) {
		System.out.println(wheelNo);
		System.out.println(price);
		System.out.println("The method Auto Ride");	
	}
	
	public void travel(int price, int mirror) {
		System.out.println(price);
		System.out.println(mirror);
		System.out.println("Travel in Auto");
	}
	
	public void consume(int tankCapacity, int milage) {
		System.out.println(tankCapacity);
		System.out.println(milage);
		System.out.println("Auto consume fuel");
	}

}
