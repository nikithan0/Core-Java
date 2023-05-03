package com.xworkz.computer1.dao;

import com.xworkz.computer1.dto.ComputerDto;

public class ComputerDao {
	ComputerDto[] computer = new ComputerDto[9];

	public boolean save(ComputerDto dto) {
		if (dto != null) {
			if (dto.getBrand() != null & dto.getModel() != null) {
				System.out.println("The given properties are valid");

				if (dto.getBrand().length() > 2 & dto.getModel().length() > 2) {
					System.out.println("The length is valid");

					for (int i = 0; i < computer.length; i++) {
						if (computer[i] == null) {
							computer[i] = dto;
							System.out.println("The computer is saved");
							return true;
						}
					}
					System.out.println("The computer is not saved");
					return false;
				}
				System.out.println("The length is not valid");
				return false;
			}
		}
		System.out.println("The given property are not valid");
		return false;
	}
	
	public ComputerDto[] readAll() {
		return computer;
	}

	public ComputerDto[] findByBrand(ComputerDto byBrand) {
		if (byBrand != null) {
			if (byBrand.getBrand().length() > 3) {
				System.out.println("The lenght is valid");
				for (int i = 0; i < computer.length; i++) {
					if (computer[i] != null) {
						computer[i] = byBrand;
						System.out.println("The brand is valid");
						return computer;
					}
				}
				System.out.println("The brand is not valid");
				return null;
			}
			System.out.println("The length is not valid");
			return null;
		}
		System.out.println("The Brand is not found");
		return null;
	}

	public boolean updateByBrand(String brand, String model) {
		if (brand != null & brand.length() > 3) {
			System.out.println("The brand is valid");
			if (model != null & model.length() > 2) {
				System.out.println("The model is valid");
				for (int i = 0; i < computer.length; i++) {
					if (computer[i] != null) {
						computer[i].getBrand().equals(brand);
						computer[i].setModel(model);
						System.out.println("The model is updated");
						return true;
					}
				}
				System.out.println("The model is not updated");
				return false;

			}
			System.out.println("The model is not found");
			return false;

		}
		System.out.println("The brand is not valid");
		return false;
	}
	
	public boolean deleteByColour(String colour) {
		if(colour!= null & colour.length()>2) {
			for(int i=0; i<computer.length; i++) {
				if(computer[i]!= null) {
					if(computer[i].getColour().equals(colour)){
						System.out.println("Deleted successfully");
						return true;
					}
				}
				}
			System.out.println("Unsuccesfull deletion");
			return false;
		}
		System.out.println("the colour is not valid");
		return false;
	}

	

}
