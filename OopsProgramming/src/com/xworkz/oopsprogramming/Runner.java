package com.xworkz.oopsprogramming;

public class Runner extends Laptop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop("HP",60990, "Rose Gold", 1.95f, 11.6d);
		laptop.storingData();
		laptop.workingPurpose();
		laptop.playMusic();
		Lenevo lenovo = new Lenevo(14.00f, "HD Graphics 520");
		lenovo.playGames();
		lenovo.keyboardLight();
		Dell dell = new Dell("APU Quad Core A6", "Windows 10");
		dell.toWatchMovies();
		dell.forInformation();
		Acer acer = new Acer("1TB", "8GB");
		acer.goodUsage();
		acer.camera();
		
		
		
		
		
		
		
		
		
		
	}

}
