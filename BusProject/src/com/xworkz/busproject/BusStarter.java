package com.xworkz.busproject;

import com.xworkz.busproject.busdata.Bus;

public class BusStarter extends Bus {

	public static void main(String[] args) {
		
		BusStarter bus1 = new BusStarter();
		bus1.seats = 30;
		bus1.colour = "White";
		System.out.println(bus1.seats);
		System.out.println(bus1.colour);
		

	}
	

}
