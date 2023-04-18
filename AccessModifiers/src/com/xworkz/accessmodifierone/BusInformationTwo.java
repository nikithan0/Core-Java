package com.xworkz.accessmodifierone;

import com.xworkz.accessmodifier.BusInformation;

public class BusInformationTwo extends BusInformation {
	
	public static void main(String[] args) {
		BusInformation.comfortable();
		System.out.println("Printing by extending");
	
	
	BusInformationTwo object = new BusInformationTwo();
	object.haveEnoughSpace();

	}
}