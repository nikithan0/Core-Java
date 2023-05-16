package com.xworkz.accessspecifiers;

public class Fruit {
	public static  String name = "Mango";	
	protected static int weight = 2;
	static String taste = "Sweet";
	private static int price;
	
	public static void hasTaste() {
		healthy();
		System.out.println("Has taste");
	}
	private static void healthy() {
		int price = 100;
		System.out.println(price);
		System.out.println("Good for health");
	}
	
	protected static void containsVitamins() {
		System.out.println("Has efficient vitamins");
		
	}

}
