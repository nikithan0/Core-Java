package com.xworkz.resume.dto;

public class AddressDto {
	
	int doorNo;
	String streetName;
	String city;
	String state;
	
	public AddressDto(int doorNo, String streetName, String city, String state) {
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;	
	
	}
	
	@Override
	public String toString() {
		return "AddressDto [doorNo =" + doorNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
