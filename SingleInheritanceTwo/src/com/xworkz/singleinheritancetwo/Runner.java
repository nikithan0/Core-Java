package com.xworkz.singleinheritancetwo;

public class Runner extends Telephone{
	
	public static void main(String[] args) {
		
		Telephone telephone = new Telephone("Switch hook", 12);
		telephone.calling();
		telephone.rings();
		System.out.println(telephone.functionalComponent);
		System.out.println(telephone.noOfButton);
		Mobile mobile = new Mobile("Redmi", 4.7f);
		mobile.forCommunication();
		mobile.showsTime();
	}

}
