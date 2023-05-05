package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesDao {

	VegetablesDto[] vegetable = new VegetablesDto[10];

	public boolean save(VegetablesDto dto) {
		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable[i] == null) {
				vegetable[i] = dto;
				System.out.println("Saved successfully");
				return true;
			}
		}
		return false;
	}

	public VegetablesDto findByName(String name) {
		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable[i] != null) {
				if (vegetable[i].getName().equals(name)) {
					return vegetable[i];
				}
			}
		}
		return null;
	}

	public boolean dltByName(String name) {
		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable != null) {
				if (vegetable[i].getName().equals(name)) {
					vegetable[i] = null;
					System.out.println("Deleted successfully");
					return true;
				}
			}
		}
		return false;
	}

	public VegetablesDto[] readAll() {
		return vegetable;
	}

}
