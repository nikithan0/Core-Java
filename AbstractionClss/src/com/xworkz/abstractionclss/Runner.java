package com.xworkz.abstractionclss;

public class Runner {
	public static void main (String[] args) {
		Dell dell = new Dell();
		dell.powerInBuilt();
		dell.easyToUse();
		dell.portable();
		dell.easyToCarry();	
		dell.forEditing();
		dell.hasCamera();
		
		Acer acer = new Acer();
		acer.powerInBuilt();
		acer.easyToUse();
		acer.portable();
		acer.easyToCarry();	
		acer.forEditing();
		
		HP hp = new HP();
		hp.powerInBuilt();
		hp.easyToUse();
		hp.portable();
		hp.easyToCarry();	
		hp.forEditing();
		
		Laptop.forCommunication();
		
		
		
	}

}
