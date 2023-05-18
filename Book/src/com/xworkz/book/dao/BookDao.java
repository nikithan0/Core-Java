package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public class BookDao extends AbstractDao{
	BookDto[] book = new BookDto[9];

	public boolean save(BookDto dto) {
		if (dto != null) {
			if (dto.getBookName() != null) {
				if (dto.getBookName().length() > 3) {
					for (int i = 0; i < book.length; i++) {
						if (book[i] == null) {
							book[i] = dto;
							System.out.println("Book is saved");
							return true;
						}
					}
					System.out.println("Book is not saved");
					return false;
				}
				System.out.println("Space is not valid");
			}
		}
		System.out.println("Book is valid");
		return false;
	}

	public BookDto findByName(String bookName) {
		if (bookName != null && bookName.length() > 3) {
			for (int i = 0; i < book.length; i++) {
				if (book[i] != null) {
					if (book[i].getBookName().equals(bookName)) {
						System.out.println("The name is found");
						return book[i];
					}
				}
			}
			System.out.println("The book name is not found");
			return null;
		}
		System.out.println("The name is not valid ");
		return null;
	}

	public BookDto updateByPrice(int price, String bookName) {

		if (price != 0) {
			if (bookName != null && bookName.length() > 3) {
				for (int i = 0; i < book.length; i++) {
					if (book[i] != null) {
						if (book[i].getPrice() == price) {
							book[i].setBookName(bookName);
							System.out.println("The book name is update");
							return book[i];
						}
					}
				}
				System.out.println("The is not updated");
				return null;
			}
			System.out.println("The book name is not valid");
			return null;
		}
		System.out.println("The given dto is not valid");
		return null;
	}

	public boolean deleteByName(String bookName) {
		if (bookName != null && bookName.length() > 3) {
			for (int i = 0; i < book.length; i++) {
				if (book[i] != null) {
					if (book[i].getBookName().equals(bookName)) {
						book[i] = null;
						System.out.println("Name deleted successfully");
						return true;
					}
				}
			}
			System.out.println("The name is not deleted");
			return false;
		}
		System.out.println("The book name is not valid");
		return false;
	}

	public BookDto[] readAll() {
		return book;
	}

	

	
}