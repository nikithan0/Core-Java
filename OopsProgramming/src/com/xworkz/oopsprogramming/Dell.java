package com.xworkz.oopsprogramming;

public class Dell extends Laptop {
	String processor;
	String os;
	
	public Dell(String processor, String os) {
		this.processor=processor;
		this.os=os;
		System.out.println(this.processor);
		System.out.println(this.os);
	}
	
	public void toWatchMovies() {
		System.out.println("Watching movie");
	}
	
	public void forInformation() {
		System.out.println("Search information");
	}

}
