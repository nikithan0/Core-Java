package com.xworkz.oopsprogramming;

public class Lenevo extends Laptop {
	
	  float displaySize;
	  String graphics;
	  
	  public Lenevo(float displaySize, String graphics) {
		  this.displaySize=displaySize;
		  this.graphics=graphics;
		  System.out.println(this.displaySize);
		  System.out.println(this.graphics);
	  }
	  
	  public void playGames() {
		  System.out.println("Gaming");
	  }
	  
	  public void keyboardLight() {
		  System.out.println("Keyboard light feature");
	  }
	  
			  

}
