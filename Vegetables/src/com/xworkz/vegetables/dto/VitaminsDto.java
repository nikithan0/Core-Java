package com.xworkz.vegetables.dto;

public class VitaminsDto {
	
	String vitaminName;
	String quantity;
	
	public VitaminsDto(String vitaminName, String quantity) {
		this.vitaminName = vitaminName;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "VitaminDto [vitaminName = " + vitaminName + ", quantity " + quantity + "]"; 
	}

}
