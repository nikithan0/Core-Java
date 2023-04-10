package com.xworkz.casting;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit casting byte in int;
				byte x = 67;
				int y;
				y = x;
			    System.out.println(y);		
			 // explicit casting byte to double;
			    byte c = 123;
			  double z = 1.87d;
			  c = (byte)z;
			  System.out.println(c);
			  
			  //implicit casting;
			  short feesConsession = 2000;
			  int paid = 38980;
			  paid = feesConsession; 
			  System.out.print(paid);  
			  //explicit casting;
			  long totalFees = 54565L;
			  feesConsession = (short)totalFees;
			  System.out.println(feesConsession);
			  
			  //Type converting;
			  int sum1 = 2000;
			  byte sum2 = 100;
			  sum1 = sum2;
			  System.out.println(sum1);
			  //Type casting;
			  long sum3 = 300L;
			  sum1 = (int)sum3;
			  System.out.println(sum1);
			  
			  //Type converting;
			  float percentage1 = 73.3F;
			  int total = 500;
			  percentage1 = total;
			  System.out.println(percentage1);
			  //Type casting;
			  double totalPercnt = 100.0d;
			  percentage1 = (float)totalPercnt;
			  System.out.print(percentage1);
			  
			  //Type converting;
			  double value = 100.00d;
			  byte value1 = 100;
			  value = value1;
			  System.out.println(value);
			  //Type casting;
			  float value2 = 50.99F;
			  value2 = (float)value;
			  System.out.println(value2);
			  
			  //Type converting 
			  long count1 = 9876L;
			  int count2 = 647;
			  count1 = count2;
			  System.out.println(count1);
			  //Type casting;
			  short count3 = 24556;
			  count3 = (short)count1;
			  System.out.println(count3);
			  
			  
			  
			  
			  
			  
			  
			 
			  
	}

}
