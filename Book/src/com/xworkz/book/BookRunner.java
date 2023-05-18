package com.xworkz.book;

import com.xworkz.book.dao.BookDao;
import com.xworkz.book.dao.BookDaoTwo;
import com.xworkz.book.dto.BookDto;

public class BookRunner {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		BookDto dto1 = new BookDto("ClassMate", 100, 200, "Unruled book", "Long size");
		BookDto dto2 = new BookDto("Just write", 20, 100, "Ruled book", "King size");
		BookDto dto3 = new BookDto("Capable", 50, 150, "Ruled book", "Long size");
		BookDto dto4 = new BookDto("Rajguru", 60, 80, "Unruled book", "Long size");
		BookDto dto5 = new BookDto("Notebook",180, 200, "Ruled book", "A5 Size");
		
		
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		
		System.out.println("----------------------------------------------------------");
		//From BookDaoTwo;
		BookDaoTwo subj = new BookDaoTwo();
		
		boolean dao2 = subj.save(dto4);
		System.out.println(dao2);
		
		BookDto dao3 = subj.findByPrice(180);
		System.out.println(dao3);
		
		BookDto dao4 = subj.updateByprice(50, "NoteBook");
		System.out.println(dao4);
				
		System.out.println("Price deleted");
		subj.deleteByPrice(50);
		
		System.out.println("----------------------------------------------------------");
		
		//BookDao methods;
		BookDto obj = dao.fingByName("ClassMate");
		System.out.println(obj);
		
		System.out.println("----------------------------------------------------------");
		
		BookDto update = dao.updateByPrice(20, "Gloris");
		System.out.println(update);
		
		System.out.println("----------------------------------------------------------");
		
		boolean delete = dao.deleteByName("Rajguru");
		System.out.println(delete);	
		
		System.out.println("----------------------------------------------------------");		
		
		BookDto[] read = dao.readAll();
		for(int i=0; i<read.length; i++) {
			System.out.println(read[i]);
		}
	}

}
