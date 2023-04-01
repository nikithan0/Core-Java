package com.xworkz.singleinheritancetwo;

public class Mobile extends Telephone{
	
	String brand;
	float dislaySize;
	
	public Mobile(String brand, float dislaySize) {
		this.brand=brand;
		this.dislaySize=dislaySize;
		System.out.println(this.brand);
		System.out.println(this.dislaySize);
	}
	
	public void forCommunication() {
		System.out.println("Wireless communication");
	}
	
	public void showsTime() {
		System.out.println("Display time on screen");
	}


}
