package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.EngineType;

public class BusRunner {

	public static void main(String[] args) {
	  
		Bus.comfertableTravel();
		Bus.hasEnoughSpace();
		Bus.hasAcCondition();
		Bus.name = "Rajahamsa";
		Bus.company = "KSRTC";
		
		System.out.println("------------------------");
		
		System.out.println(EngineType.DIESEL.engine);
		
		System.out.println("------------------------");
		
		Bus b1 = new Bus("White", 30, "1400L", "Diesel", true);		
	
		
		System.out.println("------------------------");
		
		Bus b2 = new Bus();
		b2.consumeFuel();
		b2.carryPassenger();
	    
		
 
	}

}
