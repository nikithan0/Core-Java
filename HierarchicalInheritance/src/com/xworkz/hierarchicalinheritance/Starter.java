package com.xworkz.hierarchicalinheritance;

public class Starter extends Animal {
	
	public static void main(String[] args) {
		
		Animal obj = new Animal("Zoe", "Female", 4);
		obj.emotional();
		obj.eating();
		Cat obj1 = new Cat("Siamese", "Bella", "Blue");
		obj1.eating();
		obj1.faceRubbing();
		Dog dog = new Dog("Scooby", "Australian Kelpie", 7);
		dog.barking();
		dog.digging();
		
	}

}
