package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.EngineType;

public class BusRunner {

	public static void main(String[] args) {
		//static methods;
		 Bus. comfertableTravelling();
		 Bus.hasGoodAcCondition();	 
		 
		 System.out.println("-----------------------");
		 
		 System.out.println(EngineType.DIESEL.engine);
		 
		System.out.println("------------------------"); 
		 
		Bus b1 = new Bus();	
		b1.seats=30;
		b1.colour="White";
		b1.tyres=6;
		b1.seatType="Sleeper";
		b1.hasAC=true;
		System.out.println(b1.seats);
		System.out.println(b1.colour);
		System.out.println(b1.tyres);
		System.out.println(b1.seatType);
		System.out.println(b1.hasAC);
		
		System.out.println("---------------------");
		
		Bus.name = "Rajahamsa";
		Bus.company = "KSRTC";
		System.out.println(Bus.name);
		System.out.println(Bus.company);
		
		System.out.println("--------------------------");
		
		Bus b2 = new Bus();
		b2.hasEnoughSpace();
		b2.carryPasengers();
		
		}

}
