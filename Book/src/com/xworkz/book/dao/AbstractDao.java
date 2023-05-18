package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public abstract class AbstractDao {
	
	public abstract boolean save(BookDto dto);
	public abstract BookDto findByPrice(int price);
	public abstract BookDto updateByprice(int price, String bookName);
	public abstract boolean deleteByPrice(int price);
	public abstract BookDto[] readAll();
	

}
