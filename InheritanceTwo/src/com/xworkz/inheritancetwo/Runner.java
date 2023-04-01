package com.xworkz.inheritancetwo;

public class Runner extends LEDBulb {
	
	public static void main(String[] args) {
		
		Runner object = new Runner ();
		
		System.out.println(object.name);
		System.out.println(object.inventedIn);
		System.out.println(object.brand);
		System.out.println(object.price);
		System.out.println(object.materialUsed);
		System.out.println(object.colour);
		
		object.lightProduction();
		object.electricityConsuption();
		object.goodBrightness();
		object.powerSource();
     	object.lowerElectricbills();
		object.visibleLight();
		
	}

}
