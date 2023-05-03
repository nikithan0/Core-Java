package com.xworkz.computer1.dto;

public class ProcessorDto {
	
	String brand;
	String generation ;
	String model;
	
	public ProcessorDto(String brand, String generation, String model) {
		this.brand = brand;
		this.generation = generation;
		this.model = model;
	}

	@Override
	public String toString() {
		return "ProcessorDto [brand=" + brand + ", generation=" + generation + ", model=" + model + "]";
	}
	

}
