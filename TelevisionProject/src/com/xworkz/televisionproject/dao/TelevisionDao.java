package com.xworkz.televisionproject.dao;

import com.xworkz.televisionproject.custom.DtoLengthIsNotValidException;
import com.xworkz.televisionproject.custom.FailedToDeleteException;
import com.xworkz.televisionproject.custom.FailedToFindNameException;
import com.xworkz.televisionproject.custom.FailedToUpdateException;
import com.xworkz.televisionproject.dto.TelevisionDto;

public interface TelevisionDao {
	
	public boolean save(TelevisionDto dto) throws DtoLengthIsNotValidException;
	public TelevisionDto update(String color, String name) throws FailedToUpdateException;
	public TelevisionDto findByName(String name) throws FailedToFindNameException;
	public TelevisionDto delete(Integer price) throws FailedToDeleteException;
	public TelevisionDto findbyName(String name, Integer price);
	public TelevisionDto[] readAll();
	
	
	

}
