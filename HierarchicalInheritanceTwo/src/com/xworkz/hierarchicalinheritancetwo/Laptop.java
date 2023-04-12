package com.xworkz.hierarchicalinheritancetwo;

public class Laptop extends Device{
	
	String laptopName;
	double screenSize;
	float weight; 
	
	public Laptop(String laptopName, double screenSize, float weight) {
		this.laptopName=laptopName;
		this.screenSize=screenSize;
		this.weight=weight;
		System.out.println(this.laptopName);
		System.out.println(this.screenSize);
		System.out.println(this.weight);
	}
	
	public void greatForWork() {
		System.out.println("Good performance");
	}
	
	public void playing() {
		System.out.println("Can play games");
	}
	

}
