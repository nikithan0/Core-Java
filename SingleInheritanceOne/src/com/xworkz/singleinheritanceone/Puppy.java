package com.xworkz.singleinheritanceone;

public class Puppy extends Dog{
	String colour;
	String gender;
	
	
	 public Puppy(String colour, String gender ) {
		 this.colour=colour;
		 this.gender=gender;
		 System.out.println(this.colour);
		 System.out.println(this.gender);
	 }
	
	public void playful() {
		System.out.println("Plays happily");
	}
	
	public void bitting() {
		System.out.println("Bites gentally while playing");
	}

}
