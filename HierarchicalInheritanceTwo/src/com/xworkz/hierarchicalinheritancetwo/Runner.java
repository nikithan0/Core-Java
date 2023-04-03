package com.xworkz.hierarchicalinheritancetwo;

public class Runner extends Device {
	
	public static void main(String[] args) {
		
		Device device = new Device(80000, "Pen drive", "mboard");
		System.out.println(device.price);
		System.out.println(device.name);
		System.out.println(device.motherBoard);
		device.haveApplications();
		device.displayFunctionality();
		Laptop laptop = new Laptop("Lenovo", 15.6D, 1.36F);
		laptop.greatForWork();
		laptop.playing();
		Mobile mobile = new Mobile("Samsung", 128, 6);
		mobile.calling();
		mobile.easyToCarry();
		
	}

}
