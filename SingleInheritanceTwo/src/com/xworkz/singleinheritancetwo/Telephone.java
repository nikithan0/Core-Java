package com.xworkz.singleinheritancetwo;

public class Telephone {
	
	String functionalComponent;
	int noOfButton;
	
	public Telephone() {
		System.out.println("Default constructor");
	}
	
	public Telephone(String functionalComponent, int noOfButton) {
		this.functionalComponent=functionalComponent;
		this.noOfButton=noOfButton;
	}
	
	public void calling() {
		System.out.println("Calling function");
	}
	
	public void rings() {
		System.out.println("Ringing while incoming call");
	}
   

}
