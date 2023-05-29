package com.xworkz.engineproject;

import com.xworkz.engineproject.custom.FailedToSaveException;
import com.xworkz.engineproject.custom.FailedToUpdateException;
import com.xworkz.engineproject.custom.FailedtToDeleteException;
import com.xworkz.engineproject.custom.LengthIsNotValidException;
import com.xworkz.engineproject.dao.EngineImpl;
import com.xworkz.engineproject.dto.EngineDto;

public class EngineRunner {

	public static void main(String[] args) {
		EngineImpl dao = new EngineImpl();

		EngineDto dto = new EngineDto("Diesel engine", 48500, "Kubota Group", 200, "Two stroke", "Trucks");
		EngineDto dto2 = new EngineDto("Rotary engine", 6431, "Mazda", 157, "Internal combustion", "Cars");
		
		try {
			try {
				dao.save(dto2);
			} catch (FailedToSaveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (LengthIsNotValidException e1) {
			e1.printStackTrace();
		}
		
		try {
			dao.save(dto);
		}catch (LengthIsNotValidException e) {
			e.printStackTrace();
		} catch (FailedToSaveException e) {
			e.printStackTrace();
		}
		
		EngineDto en = null;
		try {
			en = dao.update("Diesel engine", 49000);
		} catch (FailedToUpdateException e) {
		e.printStackTrace();
		}
		System.out.println(en);

		EngineDto en1 = null;
		try {
			en1 = dao.delete("Rotary engine");
		} catch (FailedtToDeleteException e) {
			e.printStackTrace();
		}
		System.out.println(en1);

		EngineDto[] reading = dao.readAll();
		for (int i = 0; i < reading.length; i++) {
			if (reading[i] != null) {
				System.out.println(reading[i]);
			}
		}

	}

}
