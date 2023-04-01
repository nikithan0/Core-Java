package com.xworkz.inheritanceone;

public class Starter {
	
	public static void main(String[] args) {
		
		Bus obj1 = new Bus(6,"Mercedes-Benz");
		obj1.forTravelling();
		obj1.consumeFuel();
		System.out.println(obj1.numberOfTyre);
		System.out.println(obj1.brand);
		
		Car obj2 = new Car(4,"Maruti Suzuki");
		obj2.speed();
		obj2.giveComfort();
		
		AutoRikshaw obj3 = new AutoRikshaw("8 litres",3);
		obj3.makesSound();
		obj3.forTransport();
		
	}

}
