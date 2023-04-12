package com.xworkz.aggregation;

public class Treatment {
	
	String treatmentFor; 
	String departmentName;
	int roomNo;
	String treatementType;
	String treatmentGivenBy;
	
	public Treatment(String treatmentFor, String departmentName, int roomNo, String treatementType, String treatmentGivenBy) {
		this.treatmentFor=treatmentFor;
		this.departmentName=departmentName;
		this.roomNo=roomNo;
		this.treatementType=treatementType;
		this.treatmentGivenBy=treatmentGivenBy;
	}
}
