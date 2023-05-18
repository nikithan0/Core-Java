package com.xworkz.wrapperclass;

public class RunnerClass {
	public static void main(String args []) {
		
		int a1 = 31;
		int a2 = 250;
		int a3 = 34;
		int a4 = 45;
		
		Integer ans1 = Integer.valueOf(a1);
		System.out.println(ans1);
		Integer ans2 = Integer.valueOf(a2);
		System.out.println(ans2);
		
		Integer ans3 = a3;
		System.out.println(ans3);
		Integer ans4 = a4;
		System.out.println(ans4);
		
		Integer a5 = ans1.intValue();
		System.out.println(a5);
		 
		int a6 = ans2;
		System.out.println(a6);
		
		System.out.println("---------------------");
		
		byte b1 = 11;
		byte b2 = 12;
		byte b3 = 13;
		byte b4 = 14;
		
		Byte b5 = Byte.valueOf(b1);
		System.out.println(b5);
		Byte b6 = Byte.valueOf(b2);
		System.out.println(b6);
		
		Byte b7 = b3;
		System.out.println(b7);
		Byte b8 = b4;
		System.out.println(b8);
		
		Byte b9 = b6;
		System.out.println(b9);
		
		Byte b = b7.byteValue();
		System.out.println(b);
		
		Byte ans = Byte.valueOf((byte)78);
		System.out.println(ans);
		
		System.out.println("---------------------");
		
		short c = 1000;
		short c1 = 2000;
		short c2 = 3000;
		short c3 = 4000;
		
		Short c4 = Short.valueOf(c);
		System.out.println(c4);
		Short c5 = Short.valueOf(c1);
		System.out.println(c5);
		
		Short c6 = Short.valueOf(c2);
		System.out.println(c6);
		Short c7 = Short.valueOf(c3);
		System.out.println(c7);
		
		short c8 = c4;
		System.out.println(c8);
		short c9 = c5.shortValue();
		System.out.println(c9);
		
		System.out.println("---------------------");
		
		long value = 1220000;
		long value1 = 1998989;
		long value2 = 7482340097l;
		long value3 = 7628426873l;
		
		long values = value+value1;
		System.out.println(values);
		
		Long value4 = Long.valueOf(value);
		System.out.println(value4);
		Long value5 = Long.valueOf(value1);
		System.out.println(value5);
		
		Long value6 = value2;
		System.out.println(value6);
		Long value7 = value3;
		System.out.println(value7);
		
		long value8 = value4;
		System.out.println(value8);
		long value9 = value7.longValue();
		System.out.println(value9);
		
		System.out.println("---------------------");
		
		float num = 8.90f;
		float num1 = 4.6f;
		float num2 = 5.65f;
		float num3 = 4.5f;
		
		Float num4 = Float.valueOf(num);
		System.out.println(num4);
		Float num5 = Float.valueOf(num1);
		System.out.println(num5);
		
		Float num6 = Float.valueOf(num2);
		System.out.println(num6);
		Float num7 = Float.valueOf(num3);
		System.out.println(num7);
		
		float num8 = num6;		
		System.out.println(num8);
		float num9 = num4;
		System.out.println(num9);
		
		System.out.println("---------------------");
		
		double count = 66.89;
		double count1 = 88.9878;
		double count2 = 899.99;
		double count3 = 89.88;
		
		Double count4 = Double.valueOf(count);
		System.out.println(count4);
		Double count5 = Double.valueOf(count1);
		System.out.println(count5);
		
		Double count6 = count2;
		System.out.println(count6);
		Double count7 = count3;
		System.out.println(count7);
		
		double count8 = count4;
		System.out.println(count8);
		double count9 = count7;
		System.out.println(count9);
		
		System.out.println("---------------------");
		
		char ch = 'a';
		char ch1 = 'b';
		char ch2 = 'c';
		char ch3 = 'd';
		
		Character ch4 = Character.valueOf(ch);
		System.out.println(ch4);
		Character ch5 = Character.valueOf(ch1);
		System.out.println(ch5);
		
		Character ch6 = Character.valueOf(ch2);
		System.out.println(ch6);
		Character ch7 = Character.valueOf(ch3);
		System.out.println(ch7);
		
		char ch8 = ch4;
		System.out.println(ch8);
		char ch9 = ch7.charValue();
		System.out.println(ch9);
		
		System.out.println("---------------------");
		
		boolean bl = true;
		boolean bl1 = false;
		boolean bl2 = false;
		boolean bl3 = true;
		
		Boolean bl4 = Boolean.valueOf(bl);
		System.out.println(bl4);
		Boolean bl5 = Boolean.valueOf(bl1);
		System.out.println(bl5);
		
		Boolean bl6 = bl2;
		System.out.println(bl6);
		Boolean bl7 = bl3;
		System.out.println(bl7);
		
		boolean bl8 = bl4;
		System.out.println(bl8);
		boolean bl9 = bl7;
		System.out.println(bl9);
		
		Boolean boo = Boolean.TRUE;
		System.out.println(boo);
		
	}

}
