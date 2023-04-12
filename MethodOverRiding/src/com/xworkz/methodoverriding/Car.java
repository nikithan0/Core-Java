package com.xworkz.methodoverriding;

public class Car {
		public void ride(int number, int milage) {
			System.out.println(number);
			System.out.println(milage);
			System.out.println("The method car Ride");	
		}
		
		public void travel(int number, int price) {
			System.out.println(number);
			System.out.println(price);
			System.out.println("Travelling in car");
		}
		
		public void consume(int number, int price) {
			System.out.println(number);
			System.out.println(price);
			System.out.println("Car cosume petrol");
		}

}
