package com.xworkz.accessspecifiers;

public class Runner {
	
	public static void main(String[] args) {
		Fruit.hasTaste();	
		System.out.println(Fruit.weight);
		System.out.println(Fruit.name);
		System.out.println(Fruit.taste);
		
		Fruit.hasTaste();
		Fruit.containsVitamins();
	
	}
	
	

}
