package com.xworkz.inheritancetwo;

public class LEDBulb extends TubeLight {
	
	String materialUsed = "Semiconductors";
	String colour = "White";
	
	public void lowerElectricbills() {
		System.out.println("Consume less electricity");
	}
	
	public void visibleLight() {
		System.out.println("Bright light");
	}

}
