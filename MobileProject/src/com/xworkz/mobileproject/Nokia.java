package com.xworkz.mobileproject;

public class Nokia implements Mobile {

	@Override
	public void callFunction() {
		System.out.println("Nokia has calling function");
	}
	@Override
	public void messageFunction() {
		System.out.println("Nokia has messaging function");
	}
	@Override
	public void torchLight() {
		System.out.println("Nokia has torchlight");
	}
	@Override
	public void versatileDisplay() {
		System.out.println("Nokia has versatile display");
	}
}
