package com.xworkz.mobileproject;

public class RunnerClass {

	public static void main(String[] args) {
		Nokia nokia = new Nokia();
		nokia.callFunction();
		nokia.messageFunction();
		nokia.torchLight();
		nokia.versatileDisplay();
		
		System.out.println("-----------------------------------------");
		
		Samsung samsung = new Samsung();
		samsung.touchScreen();
		samsung.highQualityCamera();
		samsung.vedioCallFunction();
		samsung.extraStorage();
		samsung.mobilePayment();
		samsung.callFunction();
		samsung.messageFunction();
		samsung.torchLight();
		
		System.out.println("-----------------------------------------");
		
		Redmi redmi = new Redmi();
		redmi.touchScreen();
		redmi.highQualityCamera();
		redmi.vedioCallFunction();
		redmi.extraStorage();
		redmi.mobilePayment();

	}

}
