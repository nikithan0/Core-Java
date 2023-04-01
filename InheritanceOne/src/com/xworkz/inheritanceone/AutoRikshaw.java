package com.xworkz.inheritanceone;

public class AutoRikshaw  {
	
	
	String fuelTankCapacity; 
	int tyres;
	
	public AutoRikshaw(String fuelTankCapacity, int tyres) {	
		this.fuelTankCapacity=fuelTankCapacity;
		this.tyres=tyres;
		System.out.println(this.fuelTankCapacity);
		System.out.println(this.tyres);
	}
	
	public void makesSound() {
		System.out.println("It makes noise");
	}
	
	public void forTransport() {
		System.out.println("Use as public transport system");
	}

}
