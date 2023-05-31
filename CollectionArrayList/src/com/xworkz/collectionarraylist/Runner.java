package com.xworkz.collectionarraylist;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("People");
		list.add("Java is a programming language");
		list.add("The Banglore university");
		list.add("The school of music");
		list.add("The cities");
		list.add("Banglore city");
		list.add("Manglore city");
		list.add("Mumbai city");
		list.add("Delhi city");
		list.add("Chennai city");
		list.add("The college");
		list.add("Vehicle");
		list.add("Audi car");
		list.add("Mazda car");
		list.add("Volvo");
		list.add("Mercedes-Benz");
		list.add("Kia");
		list.add("Toyota Corolla");
		list.add("Lamborghini");
		list.add("The movie");
		
		
		list.remove("The movie");
		list.remove("Lamborghini");
		list.remove("Toyota Corolla");
		list.remove("Kia");
		list.remove("Mercedes-Benz");
		
		
		
		list.add(0, "PEOPLE");
		list.add(1, "Java programming language");
		list.add(2, "The BANGLORE university");
		list.add(3, "The school of MUSIC");
		list.add(4, "The CITIES");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		System.out.println(list.get(8));
		System.out.println(list.get(9));
		System.out.println(list.get(10));
		
		System.out.println("-----------------------------");
		
		System.out.println(list.indexOf("The CITIES"));
		System.out.println(list.indexOf("Banglore city"));
		System.out.println(list.indexOf("Manglore city"));
		System.out.println(list.indexOf("Mumbai city"));
		System.out.println(list.indexOf("Delhi city"));
		
		System.out.println("-----------------------------");
		
		list.set(6, "Mumbai City");
		System.out.println(list.get(6));
		
		list.set(7, "Delhi City");
		System.out.println(list.get(7));	
		
		list.set(8, "Chennai City");
    	System.out.println(list.get(8));
     	System.out.println(list.set(10, "VEHICLES"));
		System.out.println(list.set(11, "AUDI car"));
		
		System.out.println(list.set(14,"Volvo"));
		
		String[] str = new String[list.size()];
		
		list.toArray();
		for(String arry: str) {
			System.out.println(arry);
		}
		
		
		
		

	}

}
