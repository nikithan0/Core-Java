package com.xworkz.hierarchicalinheritance;

public class Animal {
	
	String name;
	String gender;
	int legs;
	
	public Animal() {
		System.out.println("Default constructor");
	}
	
	public Animal(String name, String gender, int legs) {
		this.name=name;
		this.gender=gender;
		this.legs=legs;
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.legs);
		
	}
	
	public void emotional() {
		System.out.println("Shows emotions towards owner");
	}
	
	public void eating() {
		System.out.println("Spend part of the day in eating");
	}

}
