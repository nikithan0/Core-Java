package com.xworkz.hierarchicalinheritancetwo;

public class Mobile extends  Device {
	
	String brandName;
	int space;
	int ram;
	
	public Mobile(String brandName, int space, int ram) {
		this.brandName=brandName;
		this.space=space;
		this.ram=ram;
		System.out.println(this.brandName);
		System.out.println(this.space);
		System.out.println(this.ram);
	}
	
	public void calling() {
		System.out.println("For calling");
	}
	
	public void easyToCarry() {
		System.out.println("Can easily carry");
	}

}
