package com.xworkz.hierarchicalinheritancetwo;

public class Device {

	int price;
	String name;
	String motherBoard;
	
	public Device() {
		System.out.println("Default constructor");
	}
	
	public Device(int price, String name, String motherBoard) {
		this.price=price;
		this.name=name;
		this.motherBoard=motherBoard;	
	}
	
	public void haveApplications() {
		System.out.println("Device have some applications");
	}
	
	public void displayFunctionality() {
		System.out.println("Display functionality");
	}

}
