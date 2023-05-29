package com.xworkz.engineproject.dao;

import com.xworkz.engineproject.custom.FailedToSaveException;
import com.xworkz.engineproject.custom.FailedToUpdateException;
import com.xworkz.engineproject.custom.FailedtToDeleteException;
import com.xworkz.engineproject.custom.LengthIsNotValidException;
import com.xworkz.engineproject.dto.EngineDto;

public class EngineImpl {

	EngineDto[] engine = new EngineDto[10];

	public boolean save(EngineDto dto) throws LengthIsNotValidException, FailedToSaveException {
		if (dto != null) {
			if (dto.getName() != null) {
				if (dto.getName().length() >3) {
					System.out.println("The lenth of the name is valid");
					for (int i = 0; i < engine.length; i++) {
						if (engine[i] == null) {
							engine[i] = dto;
							System.out.println("The dto is saved");
							return true;
						}
					}
					throw new FailedToSaveException("The name is not saved");
				}
				throw new LengthIsNotValidException("The length is not valid");
			}
			System.out.println("The dto is null");
			return false;
		}
		System.out.println("The engine is not valid");
		return false;
	}

	public EngineDto update(String name, int price) throws FailedToUpdateException {
		if (name != null) {
			if (name.length()>3) {
				for (int i = 0; i < engine.length; i++) {
					if (engine[i] != null) {
						if (engine[i].getName().equals(name)) {
							engine[i].setPrice(price);
							System.out.println("The price is updated successfully");
							return engine[i];
						}
					}
				}
				throw new FailedToUpdateException("Price is failed to update");
			}
			System.out.println("The lenghtis not valid");
			return null;
			
		}
		System.out.println("The given name is not valid");
		return null;
	}

	public EngineDto delete(String name) throws FailedtToDeleteException {
		if (name != null && name.length() > 3) {
			for (int i = 0; i < engine.length; i++) {
				if (engine[i] != null) {
					engine[i].getName().equals(name);
					engine[i] = null;
					System.out.println("The name is deleted successfully");
					return engine[i];
				}
			}
			throw new FailedtToDeleteException("Failed to delete the name");		
		}
		System.out.println("The given name is not valid");
		return null;
	}
	public EngineDto[] readAll() {
		return engine;
	}

}