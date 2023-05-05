package com.xworkz.vegetables.constants;

import com.xworkz.vegetables.dao.VegetablesDao;
import com.xworkz.vegetables.dto.VegetablesDto;
import com.xworkz.vegetables.dto.VitaminsDto;

public class VegetableRunner {

	public static void main(String[] args) {
		VegetablesDao dao = new VegetablesDao();
		VitaminsDto obj = new VitaminsDto("vitamin A", "100g");

		VegetablesDto dto = new VegetablesDto("Carrot", "Orange", 100, obj, VeggieType.ROOT);
		dao.save(dto);

		VegetablesDto dto1 = new VegetablesDto("Lettuce", "Green", 100, obj, VeggieType.LEAFY);
		dao.save(dto1);

		VegetablesDto dto2 = new VegetablesDto("Pumpkin", "Orange", 100, obj, VeggieType.MARROW);
		dao.save(dto2);

		System.out.println("-----------------------------------------------------------------------");

		VegetablesDto obj1 = dao.findByName("Pumpkin");
		System.out.println(dto2);
		
		System.out.println("-----------------------------------------------------------------------");
		
		boolean info = dao.dltByName("Lettuce");
		System.out.println(info);
		
		System.out.println("-----------------------------------------------------------------------");
		
		VegetablesDto[] vegetableList = dao.readAll();
		for (int i = 0; i < vegetableList.length; i++) {
			if (vegetableList[i] != null) {
				System.out.println(vegetableList[i]);
			}
		}

	}

}
