package com.xworkz.groceries.dao;

public class GroceriesDao {
	
	String[] groceryName = new String[9];
	
	public boolean addGrocery (String grocery, int index) {
		if(grocery != null && grocery.length()>3) {
			System.out.println("Given grocery name is valid");
			for(int i=0; i<groceryName.length; i++) {
				if(groceryName[i] == null) {
					groceryName[i] = grocery;
					System.out.println("The name is added by index");
					return true;
				}				
			}
			{
				System.out.println("The name is not added");				
			}			
		}
		{
			System.out.println("The is not valid " +grocery + " this name" );
			return false;
		}			
	}	
	public String[] readGrocery() {
		return groceryName;
	}	
	public boolean updateByIndex(String previousName, int index) {
		if(previousName  != null && previousName.length()>=3) {
			System.out.println("This name is valid");
			
		   groceryName[index] = previousName;
				System.out.println("The name is updated");
					return true;
		}				
		{
			System.out.println("The name is not valid");			
		}
		return false;	
}	
	public boolean updateByString(String oldName, String updatingName) {
		if(oldName != null && oldName.length()>3) {
			System.out.println("the oldname is valid");
			if(updatingName != null && updatingName.length()>3) {
				System.out.println("the updating nameis valid");
			
				for(int i=0; i<groceryName.length; i++) {
					if(groceryName[i]!= null) {
						if(groceryName[i].equals(oldName)) {
							
							groceryName[i]=updatingName;
							System.out.println("Name is successfully updated by String");							
					}
						{
							System.out.println("the name " + oldName + " not found");
							return false;
						}					
		}
				}
				
		{
			System.out.println("index is null");
			return false;
		}
				
}
			{
				System.out.println("the updating name is valid");
				return false;
			}
}
		{
			System.out.println("the  oldname is not valid");
			return false;
		}		
	}
	
	public boolean deleteByIndex(int index) {
		if(index>=0 ) {
			if(index<groceryName.length) {
				groceryName[index] = null;
				System.out.println("Name is successfully deleted");
				return true;
			}
			{
				System.out.println("Name is not deleted");
				return false;
			}
		}
		System.out.println("Passing the negative index");
		return false;	
	}
	
	public boolean deleteByString(String deleteName) {
		if(deleteName != null) {
			for(int i=0; i<groceryName.length; i++) {
				if(groceryName[i].equals(deleteName)) {
					groceryName[i] = null;
					System.out.println("Deleted succesfully");
					return true;
				  }
				}
				System.out.println("The name is not valid");		
		}
	System.out.println("The name is null");
	return false;
	}
	
	public boolean searchValue(String str) {
		if(str != null && str.length()>3) {
			for(int i=0; i<groceryName.length; i++) {
				if(groceryName[i] != null) {
					if(groceryName[i].equals(str)) {					
					System.out.println("Str is found");
					return true;
					}
				}
			}
				{
					return false;
				}
			
			
		}
		System.out.println("The str is not valid");
		return false;
	}
	
}