package com.xworkz.singleinheritanceone;

public class Dog {
	String dogBreed;
	String name;
	
	public Dog() {
		System.out.println("The default constructor");
	}
	 public Dog(String dogBreed, String name ) {
		 this.dogBreed=dogBreed;
		 this.name=name;
		 System.out.println(this.dogBreed);
		 System.out.println(this.name);
	 }
	
	public void barking() {
		System.out.println("Barks at strangers");
	}
	
	public void yawning() {
		System.out.println("The dog yawns loudly");
	}

}
