package com.xworkz.engineproject.dao;

import com.xworkz.engineproject.dto.EngineDto;

public interface EngineInterface {
	
	public  boolean save(EngineDto dto);
	public EngineDto update(String name, int price);
	public EngineDto delete(String name);
    public EngineDto[] read();

}
