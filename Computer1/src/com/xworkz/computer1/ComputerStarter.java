package com.xworkz.computer1;

import com.xworkz.computer1.constants.CompType;
import com.xworkz.computer1.dao.ComputerDao;
import com.xworkz.computer1.dto.ComputerDto;
import com.xworkz.computer1.dto.ProcessorDto;

public class ComputerStarter {

	public static void main(String[] args) {
		
		ComputerDao dao = new ComputerDao();
	    
		ProcessorDto obj = new ProcessorDto("Dell", "8th","G15");
		
				
		ComputerDto dto = new ComputerDto("Dell", "Dell G15", "Black", 50000, obj);
		dao.save(dto);
		
		ComputerDto dto2 = new ComputerDto("Lenovo", "5th", "Grey", 45000, obj);
		dao .save(dto2);	
		
		
		dao.updateByBrand("Dell", "dell XPS");
		
		dao.deleteByColour("Grey");	
		
		System.out.println(CompType.LENOVO.comp);
		
		System.out.println("----------------------------------------");
	
        ComputerDto[] str = dao.readAll();
        	for(int i=0; i<str.length; i++) {
        	System.out.println(str[i]);
        	}
        
	}
}
