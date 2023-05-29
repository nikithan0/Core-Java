package com.xworkz.televisionproject.dto;

public class TelevisionDto {
	private String name;
	private String type;
	private String color;
	private Integer price;
	
	public TelevisionDto() {
		System.out.println("Constructor with no-args");
	}
	 
	public TelevisionDto(String name, String type, String color, Integer price) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TelevisionDto [name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
	

}
