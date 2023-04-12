package com.xworkz.hierarchicalinheritance;

public class Cat extends Animal {
	
	String breed;
	String name;
	String eyeColour;
	
	public Cat(String breed, String name, String eyeColour) {
		this.breed=breed;
		this.name=name;
		this.eyeColour=eyeColour;
		System.out.println(this.breed);
		System.out.println(this.name);
		System.out.println(this.eyeColour);
	}
	
	public void eating() {
		System.out.println("Eats meat");
	}
	
	public void faceRubbing() {
		System.out.println("Cats rubbs their face");
	}

}
