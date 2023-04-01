package com.xworkz.inheritancethree;

public class Runner extends Daughter {
	
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		
		System.out.println(runner.age);
		System.out.println(runner.name);
		System.out.println(runner.worksAt);
		System.out.println(runner.motherAge);
		System.out.println(runner.professionalIn);
		System.out.println(runner.numberOfInstruments);
		
		runner.helpsInHouseChores();
		runner.unconditionalLove();
		runner.caring();
		runner.supportive();
		runner.respectful();
		
	}
	
	
}
