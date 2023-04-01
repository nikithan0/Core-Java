package com.xworkz.singleinheritanceone;

public class Runner extends Dog{
	public static void main(String[] args) {
		Dog dog = new Dog("Husky", "Scooby");
		dog.barking();
		dog.yawning();
		Puppy puppy = new Puppy("White", "Male");
		puppy.playful();
		puppy.bitting();
		
	}

}
