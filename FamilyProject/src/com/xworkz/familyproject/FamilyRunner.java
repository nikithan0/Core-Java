package com.xworkz.familyproject;

import com.xworkz.familyproject.familydata.Family;

public class FamilyRunner {

	public static void main(String[] args) {
		
		 
		Family obj = new Family(7, 3, "Sharma", "Joint family", "Gujarat");
		
		Family obj1 = new Family( 7, 3, "Sharma", "Joint family", "Gujarat");
		
		Family obj2 = new Family(8, 4, "Sharma", "Nuclear family", "Delhi");
		
		Family obj3 = new Family(9, 2, " Iyer ", " Joint family" , "Tamil Nadu" );
		
		Family obj4 = new Family(5, 3, " Kumar", "Nuclear family", "Mumbai");
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj3));
		System.out.println(obj3.equals(obj4));
		
		
		
		
				
				

	}

}
