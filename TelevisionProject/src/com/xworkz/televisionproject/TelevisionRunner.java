package com.xworkz.televisionproject;

import com.xworkz.televisionproject.custom.DtoLengthIsNotValidException;
import com.xworkz.televisionproject.custom.FailedToDeleteException;
import com.xworkz.televisionproject.custom.FailedToFindNameException;
import com.xworkz.televisionproject.custom.FailedToUpdateException;
import com.xworkz.televisionproject.dao.TelevisionImpl;
import com.xworkz.televisionproject.dto.TelevisionDto;

public class TelevisionRunner {

	public static void main(String[] args) {
		
		TelevisionImpl dao = new TelevisionImpl();
		
		TelevisionDto dto = new TelevisionDto("Samsung", "LED", "Black", 40000);
		TelevisionDto dto1 = new TelevisionDto("Panasonic", "LED", "Black1", 49000);
		TelevisionDto dto3 = new TelevisionDto("Android", "led", "black2", 50000);
		try {
			dao.save(dto3);
		} catch (DtoLengthIsNotValidException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			dao.save(dto);
		} catch (DtoLengthIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dao.save(dto1);
		} catch (DtoLengthIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		TelevisionDto update = null;
		try {
			update = dao.update("Black1", "Philps");
		} catch (FailedToUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(update);
		
		System.out.println("----------------------------------------------------------");
	
		
		TelevisionDto find = null;
		try {
			find = dao.findByName("Philps");
		} catch (FailedToFindNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(find);
		
		System.out.println("----------------------------------------------------------");
		
		try {
			TelevisionDto delete = dao.delete(49000);
		} catch (FailedToDeleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------------------");
		
		TelevisionDto find1 = dao.findbyName("Android", 40000);
		System.out.println(find1);
		
		TelevisionDto[] read =dao.readAll();
		for(int i=0; i<read.length; i++) {
			System.out.println(read[i]);
		}
	}
}
