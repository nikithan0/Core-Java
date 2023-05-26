package com.xworkz.mobileproject;

public class Redmi implements Smartphone{

	@Override
	public void touchScreen() {
		System.out.println("Redimi has touch screen");
	}

	
	public void highQualityCamera() {
		System.out.println("Redmi has good quality camera");
	}

	@Override
	public void vedioCallFunction() {
		System.out.println("Redmi has call function");
	}

	@Override
	public void extraStorage() {
		System.out.println("Redmi has storage capcity");
		
	}
	@Override
	public void mobilePayment() {
		System.out.println("Payment can make through Redmi");
	}

}
