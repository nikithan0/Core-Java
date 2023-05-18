package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public abstract class AbstractDao {
	
	public abstract boolean save(BookDto dto);
	public abstract BookDto findByName(String bookName) ;
	public abstract BookDto updateByPrice(int price, String bookName);
	public abstract boolean deleteByName(String bookName);
	public abstract BookDto[] readAll();
	

}
