package com.xworkz.methodoverriding;


public class Runner {

	public static void main(String[] args) {
		
		//Method calling from class Vehicle;
		Vehicle obj1 = new Vehicle();
		obj1.ride(50,30);
		obj1.travel(50,30);
		obj1.consume(50,30);
		
		//Method calling from class Bike;
		Bike obj2 = new  Bike();
		obj2.ride("KTM", 43);
		obj2.travel("KTM", 100000);
		obj2.consume("KTM", 12);
		
		//Method calling from class Vehicle;
		Car obj3 = new Car();
		obj3.ride(54354, 40);
		obj3.travel(56767, 200000);
		obj3.consume(45667, 300000);
		
		//Method calling from class Auto;
		Auto obj4 = new Auto();
		obj4.ride(3,150000);
	    obj4.travel(120000,2);
	    obj4.consume(8,35);
	    
	    //Method calling from class Bus;
	    Bus obj5 = new Bus();
	    obj5.ride(209876, "Banglore");
	    obj5.travel(450, "Manglore");
	    obj5.consume(1000, "Disel");
	    
	    //Method calling from class Truck;
	    Truck obj6 = new Truck();
	    obj6.ride("Goods", 5675);
	    obj6.travel("Udupi", 6786);
	    obj6.consume("Disel", 5500);
	}

}
