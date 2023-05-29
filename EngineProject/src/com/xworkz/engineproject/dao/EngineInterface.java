package com.xworkz.engineproject.dao;

import com.xworkz.engineproject.custom.FailedToSaveException;
import com.xworkz.engineproject.custom.FailedToUpdateException;
import com.xworkz.engineproject.custom.FailedtToDeleteException;
import com.xworkz.engineproject.custom.LengthIsNotValidException;
import com.xworkz.engineproject.dto.EngineDto;

public interface EngineInterface {
	
	public  boolean save(EngineDto dto) throws LengthIsNotValidException, FailedToSaveException;
	public EngineDto update(String name, int price) throws FailedToUpdateException;
	public EngineDto delete(String name) throws FailedtToDeleteException;
    public EngineDto[] readAll();

}
