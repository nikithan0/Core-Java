package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public class BookDaoTwo extends AbstractDao {

	BookDto[] book = new BookDto[10];
	
	@Override
	public boolean save(BookDto dto) {
		for (int i = 0; i < book.length; i++) {
			if (book[i] == null) {
				book[i] = dto;
				System.out.println("Book name is saved in BookDtoTwo");
				return true;
			}
		}
		
		return false;
	}

	
	public BookDto findByName(String bookName)  {
		for(int i=0; i<book.length; i++) {
			if(book[i]!=null) {
				if(book[i].getBookName().equals(bookName)) {
					System.out.println(" price is found");
					return book[i];
				}
			}
		}
		return null;
	}
	

	public BookDto updateByPrice(int price, String bookName) {
		for(int i=0; i<book.length; i++) {
			if(book[i]!=null) {
				if(book[i].getPrice() == price) {
					book[i].setBookName(bookName);
					System.out.println("name is updated successfully");
					return book[i];
				}
			}
		}
		return null;
	}
	
	public boolean deleteByName(String bookName) {
		for(int i=0; i<book.length; i++) {
			if(book[i]!=null) {
				if(book[i].getBookName().equals(bookName)) {
					book[i] = null;
					System.out.println("Deleted Successfully");
					return true ;
				}
				
			}
		}
		return false;
	}


	public BookDto[] readAll() {
		System.out.println("reading BookDto");
		return book;
	}	
	
}
