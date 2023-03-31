package com.xworkz.oopsprogramming;

public class Laptop {
	
	String brand;
	int price;
	String colour;
	float weight;
	double screenSize;
	
	public Laptop() {
		System.out.println("Default constructor");
	}
	
	public Laptop(String brand, int price, String colour, float weight, double screenSize) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.weight=weight;
		this.screenSize=screenSize;
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.colour);
		System.out.println(this.weight);
		System.out.println(this.screenSize);
	}
	public void storingData() {
	System.out.println("Storage function");
	}
	
	public void workingPurpose() {
		System.out.println("Working function");
	}
	
	public void playMusic() {
		System.out.println("Play music");
	}

}
