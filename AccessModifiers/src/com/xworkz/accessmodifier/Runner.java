package com.xworkz.accessmodifier;

public class Runner {

	public static void main(String[] args) {
		
		//static method and variables;
		BusInformation.bus();
		BusInformation.hasAC();
		BusInformation.comfortable();
		System.out.println(BusInformation.seats);
	    System.out.println(BusInformation.boardingPoint);
	    
	    //non-static method and variables;
	    BusInformation obj = new BusInformation();
	    System.out.println(obj.deparatureTimeMaybe);
	    System.out.println(obj.typeOfSeat);
	    System.out.println(obj.hasOnlineBooking);
	    
	    
	    BusInformation obj1 = new BusInformation();
	    obj1.goodSeater();
	    obj.haveEnoughSpace();
	    

	}

}
