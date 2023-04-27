package com.xworkz.groceries.dto;

public class GroceriesDto {
	
	private String shopName;
	private String place;
	private String shopKeeperName;
	private boolean isOnlinePaymentIsAvailable;
	private long phoneNumber;
	private int noOfGroceries;
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getShopKeeperName() {
		return shopKeeperName;
	}
	
	public void setShopKeeperName(String shopKeeperName) {
		this.shopKeeperName = shopKeeperName;
	}
	
	public boolean getIsOnlinePaymentIsAvailable() {
		return isOnlinePaymentIsAvailable;
	}
	
	public void setIsOnlinePaymentIsAvailable(boolean isOnlinePaymentIsAvailable) {
		this.isOnlinePaymentIsAvailable = isOnlinePaymentIsAvailable;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;		
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getNoOfGroceries() {
		return noOfGroceries;
	}
	
	public void SetNoOfGroceries(int noOfGroceries) {
		this.noOfGroceries = noOfGroceries;
	}

}
