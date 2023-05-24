package com.xworkz.bank.dto;

public class BankDto {
	private String bankName;
	private String branch;
	private String ifscCode;
	private long numberOfUsers;
	
	public BankDto() {
		System.out.println("Default constructor");
	}
	
	public BankDto(String bankName, String branch, String ifscCode, long numberOfUsers) {
		this.bankName = bankName;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.numberOfUsers = numberOfUsers;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName=bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String geIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode=ifscCode;
	}
	public long getNumberOfUsers() {
		return numberOfUsers;
	}
	public void setNumberOfUsers(long numberOfUsers) {
		this.numberOfUsers=numberOfUsers;
	}

	@Override
	public String toString() {
		return "BankDto [bankName=" + bankName + ", branch=" + branch + ", ifscCode=" + ifscCode + ", numberOfUsers="
				+ numberOfUsers + "]";
	}
	
	

	

}
