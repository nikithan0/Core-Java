package com.xworkz.inheritanceone;

public class Bus {
	 
	int numberOfTyre;
	String brand;
	
	public Bus() {
		System.out.println("Default constructor");
	}
	
	public Bus(int numberOfTyre, String brand) {
		this.numberOfTyre=numberOfTyre;
		this.brand=brand;
		
	}
	
	public void forTravelling() {
		System.out.println("Travelling");
	}
	
	public void consumeFuel() {
		System.out.println("Use fuel");
	}

}
