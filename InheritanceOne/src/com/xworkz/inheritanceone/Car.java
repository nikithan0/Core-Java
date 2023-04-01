package com.xworkz.inheritanceone;

public class Car extends Bus {
	
	int tyre;
	String carName;
	
	public Car(int tyre, String carName) {
		this.tyre=tyre;
		this.carName=carName;
		System.out.println(this.tyre);
		System.out.println(this.carName);
	}
	
	public void speed() {
		System.out.println("Accelarate speed");
	}
	
	public void giveComfort() {
		System.out.println("Give comfort while travelling");
	}

}
