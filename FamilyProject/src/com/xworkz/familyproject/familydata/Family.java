package com.xworkz.familyproject.familydata;

public class Family {
	
	int familyMembers;
	int children;
	String familyName;
	String typeOfFamily;
	String livesIn;
	
	public Family() {
		System.out.println("Default constructor");
	}
	public Family(int familyMembers, int children, String familyName, String typeOfFamily, String livesIn) {
		this.familyMembers = familyMembers;
		this.children = children;
		this.familyName = familyName;
		this.typeOfFamily = typeOfFamily;
		this.livesIn = livesIn; 
	}
	
	public String toString() {
		return "familyMembers = "+familyMembers+", " +"children = " + children+", "+"familyName = " + familyName+", "+"typeOfFamily = " + typeOfFamily+", "+"livesIn = " + livesIn;
	}
	
	public boolean equals(Family sub) {
		if(this.familyMembers == sub.familyMembers & this.children == sub.children & this.familyName.equals(familyName))
			return true;
		else{
			return false;
		}
		
	}

}
