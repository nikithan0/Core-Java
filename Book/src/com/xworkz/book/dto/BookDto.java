package com.xworkz.book.dto;

public class BookDto {
	private String bookName;
	private int price;
	private int pages;
	private String type;
	private String bookSize;
	
	public BookDto() {
		System.out.println("Default Constructor");
	}
	
	public BookDto(String bookName, int price, int pages, String type, String bookSize) {
		super();
		this.bookName= bookName;
		this.price= price;
		this.pages=pages;
		this.type=type;
		this.bookSize=bookSize;				
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBookSize() {
		return bookSize;
	}

	public void setBookSize(String bookSize) {
		this.bookSize = bookSize;
	}

	@Override
	public String toString() {
		return "BookDto [bookName=" + bookName + ", price=" + price + ", pages=" + pages + ", type=" + type
				+ ", bookSize=" + bookSize + "]";
	}

	
	


}
