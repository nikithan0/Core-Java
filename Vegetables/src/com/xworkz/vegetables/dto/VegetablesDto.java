package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constants.VeggieType;

public class VegetablesDto {
	private String name;
	private String colour;
	private int price;
	private VitaminsDto vitamin;
	private VeggieType type;

	public VegetablesDto() {
		System.out.println("No-args constructor");
	}

	public VegetablesDto(String name, String colour, int price, VitaminsDto vitamin, VeggieType type) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.vitamin = vitamin;
		this.type = type;
	}

	@Override
	public String toString() {
		return "VegetablesDto [name=" + name + ", colour=" + colour + ", price=" + price + ", vitamin=" + vitamin
				+ ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public VitaminsDto getVitamin() {
		return vitamin;
	}

	public void setVitamin(VitaminsDto vitamin) {
		this.vitamin = vitamin;
	}

	public VeggieType getType() {
		return type;
	}

	public void setType(VeggieType type) {
		this.type = type;
	}
	
}