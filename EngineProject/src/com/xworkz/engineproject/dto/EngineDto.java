package com.xworkz.engineproject.dto;

public class EngineDto {
	
	private String name;
	private int price;
	private String brand;
	private int weight;
	private String type;
	private String usedIn;
	
	public EngineDto() {
		System.out.println("Constructo with no args");
	}
	
	public EngineDto(String name, int price, String brand, int weight, String type, String usedIn) {
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.weight=weight;
		this.type=type;
		this.usedIn=usedIn;
	}

	@Override
	public String toString() {
		return "EngineDto [name=" + name + ", price=" + price + ", brand=" + brand + ", weight=" + weight + ", type="
				+ type + ", usedIn=" + usedIn + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsedIn() {
		return usedIn;
	}

	public void setUsedIn(String usedIn) {
		this.usedIn = usedIn;
	}

}