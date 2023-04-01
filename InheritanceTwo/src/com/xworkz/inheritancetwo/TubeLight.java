package com.xworkz.inheritancetwo;

public class TubeLight extends Bulb {
	
	String brand = "Philips";
	int price = 1363;
	
	
	public void goodBrightness() {
		System.out.println("Has good brightness");
	}
	
	public void powerSource() {
		System.out.println("Corded electric");
	}

}
