package com.xworkz.resume.dto;

public class ResumeDto {
	private String name;
	private String email;
	private long phoneNumber;
	private String dob;
	private String qualification;
	private String fatherName;
	private AddressDto address;
		
	public ResumeDto(String name, String email, long phoneNumber, String dob, String qualification, String fatherName,
			AddressDto address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.qualification = qualification;
		this.fatherName = fatherName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ResumeDto [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dob=" + dob
				+ ", qualification=" + qualification + ", fatherName=" + fatherName + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	
	

}
