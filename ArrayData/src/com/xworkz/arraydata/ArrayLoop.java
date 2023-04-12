package com.xworkz.arraydata;

public class ArrayLoop {
	
	public static void main(String[] args) {
	
	int[] price = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    byte[] registerNo = {101, 102, 103,104, 105, 106, 107, 108, 109, 110};
    String[] animal = {"Cat", "Dog", "Cow", "Sheep", "Goat", "Lion", "Tiger"};
    char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    
    String[] company = new String[40];
    char[] grade = new char[10];
    float[] percentage = new float[13];
    byte[] marks = new byte[100];
    short[] values = new short[19];
    
    for(int i=0; i<price.length; i++) {
    	if(price[i]!=0) {
    		System.out.println(price[i]);
    	i++;
    	}
    	}
    
    	for(int j=registerNo.length-1; j>0; j--) {   
    		if(registerNo[j]%2!=0) {
    		System.out.println(registerNo[j]);
    		j--;
    		}
    	}
    
    	for(int i=0; i<numbers.length; i++) {
    		if(numbers[i]%2==0) {
    			System.out.println(numbers[i]);
    		}
    	}
    	
	}  
    
	}
	

