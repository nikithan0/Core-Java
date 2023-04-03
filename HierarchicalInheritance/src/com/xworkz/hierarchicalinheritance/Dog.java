package com.xworkz.hierarchicalinheritance;

public class Dog extends Animal{
	
	String name;
	String dogBreed;
	int month;
	
	public Dog(String name, String dogBreed, int month) {
		this.name=name;
		this.dogBreed=dogBreed;
		this.month=month;
		System.out.println(this.name);
		System.out.println(this.dogBreed);
		System.out.println(this.month);
		
	}
	
	public void barking() {
		System.out.println("Barks at strangers");
	}
	
	public void digging() {
		System.out.println("Digging while playing");
	}

}
