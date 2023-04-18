package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.EngineType;

public class Bus {
	public static String name;
	private static String typeOfSeat;
	private static int tyres;
	protected static String company;
	protected String busColour;
	int seats;
	String tankCapacity;
	String fuel;
	boolean hasAC;
	
	public EngineType engineName;
	
	public static void comfertableTravel() {
		System.out.println("One can travel comfertably");
	}
	
	public static void hasEnoughSpace() {
		String typeOfSeat = "Sleeper";
		int tyres = 6;
		System.out.println(typeOfSeat);
		System.out.println(tyres);
		System.out.println("One can travel freely");
	}
	
	public static void hasAcCondition() {
		System.out.println("Has good AC conditon");
	}
	
	public void consumeFuel() {
		System.out.println("It consumes fuel");
	}
	
	public void carryPassenger() {
		System.out.println("Bus carry people");
	}
	
	public Bus() {
		System.out.println("Default constructor");
	}
	
	public Bus(String busColour, int seats, String tankCapacity, String fuel, boolean hasAC) {
		this.busColour = busColour;
		this.seats = seats;
		this.tankCapacity = tankCapacity;
		this.fuel = fuel;
		this.hasAC = hasAC;
		
		System.out.println(this.busColour);
		System.out.println(this.seats);
		System.out.println(this.tankCapacity);
		System.out.println(this.fuel);
		System.out.println(this.hasAC);	
		
	}

}
