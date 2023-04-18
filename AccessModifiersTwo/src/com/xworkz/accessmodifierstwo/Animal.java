package com.xworkz.accessmodifierstwo;

public class Animal {
	private static String animalType = "Dog";
	private static String name = "Scooby";
	private static String colour = "White";
	private static int price = 5000;
	
	public static String barks() {
		System.out.println(animalType);
		return animalType;
	}
	
	public static String yawns() {
		System.out.println(name);
		return name;
	}
	
	public static String digging() {
		System.out.println(colour);
		return colour;
	}
	
	public static int minimumPrice() {
		System.out.println(price);
		return price;
	}

}
