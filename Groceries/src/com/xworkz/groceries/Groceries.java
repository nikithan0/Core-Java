package com.xworkz.groceries;

import com.xworkz.groceries.dao.GroceriesDao;

public class Groceries {

	public static void main(String[] args) {
		 GroceriesDao dao = new GroceriesDao();
		 dao.addGrocery("Jeera powder", 0);
		 dao.addGrocery("Milk powder", 1);
		 dao.addGrocery("Tang", 2);
		 dao.addGrocery("Sprite", 3);
		 dao.addGrocery("Vegitables", 4);
		 dao.addGrocery("Chilly powder", 5);
		 dao.addGrocery("Garam masal", 6);
		 
		 dao.updateByIndex("Coca-cola", 0);
		 dao.updateByString("Jeera powder", "ABCD");
		 
		dao.deleteByIndex(6);
		dao.deleteByString("Chilly powder");
		
		dao.searchValue("Sprite");
		
	    String[] groceryName =  dao.readGrocery();
		 for(int i=0; i<groceryName.length; i++) {
			System.out.println(groceryName[i]);
			}
		
	}
}

