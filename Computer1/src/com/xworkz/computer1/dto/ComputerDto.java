package com.xworkz.computer1.dto;

import com.xworkz.computer1.constants.CompType;

public class ComputerDto {
	private String brand;
	private String model;
	private String colour;
	private int price;
	private ProcessorDto processor;
	
	public ComputerDto(String brand, String model, String colour, int price, ProcessorDto processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.processor = processor;
		//this.type = type;
	}
	
	private CompType type;

	@Override
	public String toString() {
		return "ComputerDto [brand=" + brand + ", model=" + model + ", colour=" + colour + ", price=" + price
				+ ", processor=" + processor + ", ]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ProcessorDto getProcessor() {
		return processor;
	}

	public void setProcessor(ProcessorDto processor) {
		this.processor = processor;
	}

	public CompType getType() {
		return type;
	}

	public void setType(CompType type) {
		this.type = type;
	}

	
	
	

}
