package com.xworkz.televisionproject.dao;

import com.xworkz.televisionproject.custom.DtoLengthIsNotValidException;
import com.xworkz.televisionproject.custom.FailedToDeleteException;
import com.xworkz.televisionproject.custom.FailedToFindNameException;
import com.xworkz.televisionproject.custom.FailedToUpdateException;
import com.xworkz.televisionproject.dto.TelevisionDto;

public class TelevisionImpl implements TelevisionDao {

	TelevisionDto[] tv = new TelevisionDto[9];

	@Override
	public boolean save(TelevisionDto dto) throws DtoLengthIsNotValidException {
		if (dto != null) {
			if (dto.getName() != null) {
				if (dto.getName().length() > 3) {
					for (int i = 0; i < tv.length; i++) {
						if (tv[i] == null) {
							tv[i] = dto;
							System.out.println("The name is saved");
							return true;
						}
					}
					System.out.println("The name is not saved");
					return false;
				}
				throw new DtoLengthIsNotValidException("The length is not valid");
			}
		}
		System.out.println("The given dto is not valid");
		return false;
	}

	public TelevisionDto update(String color, String name) throws FailedToUpdateException {
		if (color != null & color.length() > 3) {
			for (int i = 0; i < tv.length; i++) {
				if (tv[i] != null) {
					if (tv[i].getColor().equals(color));
					tv[i].setName(name);
					System.out.println("The Name is upated successfull");
					return tv[i];
				}
			}
			throw new FailedToUpdateException("Failed to update the name");
		}
		System.out.println("The given colour is not valid");
		return null;

	}

	public TelevisionDto findByName(String name) throws FailedToFindNameException {
		if (name != null && name.length() > 2) {
			for (int i = 0; i < tv.length; i++) {
				if (tv[i] != null) {
					if (tv[i].getName().equals(name)) {
						System.out.println("The name is found");
						return tv[i];
					}
				}
			}
			throw new FailedToFindNameException("The name is invalid , failed to find the name");

		}
		System.out.println("The name is not valid");
		return null;
	}

	
	public TelevisionDto delete(Integer price) throws FailedToDeleteException {
		if (price != null) {
			for (int i = 0; i < tv.length; i++) {
				if (tv != null) {
					if (tv[i].getPrice().equals(price)) {
						tv[i] = null;
						System.out.println("The price deleted successfully");
						return tv[i];
					}
				}
			}
			throw new FailedToDeleteException("The given price is not deleted");
		}
		System.out.println("The given price is not valid");
		return null;
	}

	public TelevisionDto[] readAll() {
		return tv;
	}

	public TelevisionDto findbyName(String name, Integer price) {
		if (name != null && name.length() > 3) {
			if (price != null) {
				for (int i = 0; i < tv.length; i++) {
					if (tv[i] != null) {
						tv[i].getName().equals(name);
						tv[i].getPrice().equals(price);
						System.out.println("The given dtos are found");
						return tv[i];
					}
				}
				System.out.println("The given dto is not found");
				return null;
			}
			System.out.println("The price is not valid");
		}
		System.out.println("The name is not valid");
		return null;
	}
	
	public TelevisionDto updateMethod(String name, String color, Integer price) {
		if(name!=null && color!=null) {
			if(name.length()>3 && color.length()>3) {
				for(int i=0; i<tv.length; i++) {
					if(tv[i]!=null) {
						if(tv[i].getName().equals(name)){
							if(tv[i].getColor().equals(color)) {
								tv[i].setPrice(price);
								System.out.println("The price  is updated successfully");
								return tv[i];
							}	
						}
					}
				}
				System.out.println("The name is not updated");
				return null;
			}
			System.out.println("The length is valid");
			return null;
		}
		System.out.println("The name and color is not valid");
		return null;
		
	}
}
