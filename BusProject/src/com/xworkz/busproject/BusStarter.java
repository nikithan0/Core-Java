package com.xworkz.busproject;

import com.xworkz.busproject.busdata.Bus;

public class BusStarter extends Bus {

	public static void main(String[] args) {
		
		String company = "Rajahamsa";
		System.out.println(company);
		
		BusStarter b3= new BusStarter();
		b3.busColour = "White";
		System.out.println(b3.busColour);
		
		
	

	}

}
