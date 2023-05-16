package com.xworkz.abstractionclss;

public abstract class Laptop {
	//abstract method
	public abstract void powerInBuilt();
	public abstract void easyToUse();
	public abstract void portable();
	public abstract void easyToCarry();
	public abstract void forEditing();
	
	//concrete method
	public static void forCommunication() {
		System.out.println("For communication");
	}
	
	public void sufficientStorage() {
		System.out.println("Can store data");
	}
	public void playGames() {
		System.out.println("Can play games");
		
	}
	
	

}
