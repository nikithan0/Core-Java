package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.EngineType;

public class Bus {
	
	public static String name;
	public static String company;
	private static int busNumber;
	private static String tankCapacity;
	protected int seats;
	protected String colour;
    int tyres;
    String seatType;
	boolean hasAC;
	
	EngineType typeOfEngine;
	
	
	public static void comfertableTravelling() {
		System.out.println("One can travell comfertably");
		int busNumber =16256;
		String tankCapacity = "1400L";
		System.out.println(busNumber);
		System.out.println(tankCapacity);
	}
	
	public static void hasGoodAcCondition() {
		System.out.println("Good AC condition");
	}
	
	public void carryPasengers() {
		System.out.println("Passenger travelling");
	}
	
	public void hasEnoughSpace() {
		System.out.println("Have enough space");
	}
	
	public void consumeFuel(int seats, String colour, int tyres, String seatType, boolean hasAC) {
		
		this.seats=seats;
		this.colour=colour;
		this.tyres=tyres;
		this.seatType=seatType;
		this.hasAC=hasAC;		
	
	}	

}
