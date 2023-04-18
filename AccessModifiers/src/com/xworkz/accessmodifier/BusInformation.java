package com.xworkz.accessmodifier;

public class BusInformation {
	
	public static String name = "Durgamba";
    protected  static int seats = 50;
    static String boardingPoint = "Banglore";
    
    public String deparatureTimeMaybe = "09.30";
    protected String typeOfSeat = "Semi sleeper";
    boolean hasOnlineBooking = true;
    
    public static void bus() {
    	System.out.println(name);
    	System.out.println("Printing the bus name");
    	
    	//calling method of private ;
    	busType();
    }
    
    private static void busType() {
    	String typeOfBus = "Travellers";
    	System.out.println(typeOfBus); 	
    	System.out.println("Travelling purpose");
    }    
    static void hasAC() {
    	System.out.println("Has good AC condition");
    }    
    protected static void comfortable() {
    	System.out.println("Provide comfertable travelling");
    }
    
    //Non-static methods;
    
    public void goodSeater() {
    	System.out.println("Comfertable seating");
    	
    	//Calling method of private; 
    	smoothTravelling();
    }    
    private void smoothTravelling() {   	
    	byte bookedSeat = 40;
    	System.out.println(bookedSeat);
    	System.out.println("Smooth travelling");
    } 		    
    void consumeFuel() {
    	System.out.println("Consume fuel");
    }    
    protected void haveEnoughSpace() {   	
    	System.out.println("Has enough space");
    }
}
