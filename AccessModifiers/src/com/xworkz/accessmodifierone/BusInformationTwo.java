package com.xworkz.accessmodifierone;

import com.xworkz.accessmodifier.BusInformation;

public class BusInformationTwo extends BusInformation {
	
	public static void main(String[] args) {
		BusInformation.comfortable();
		System.out.println("Printing by extending");
		BusInformation.bus();
		System.out.println(BusInformation.name);
	
	BusInformationTwo object = new BusInformationTwo();
	object.haveEnoughSpace();
	
	

	}
}