package com.xworkz.resume.dao;

import com.xworkz.resume.dto.ResumeDto;

public class ResumeDao {

	ResumeDto[] resume = new ResumeDto[9];

	public boolean saveResume(ResumeDto info) {
		if (info != null) {
			if (info.getName() != null && info.getEmail() != null) {
				System.out.println("The given names are valid");

				if (info.getName().length() > 3 && info.getEmail().length() > 3) {
					System.out.println("The length is valid");

					for (int i = 0; i < resume.length; i++) {
						if (resume[i] == null) {
							resume[i] = info;
							System.out.println("The name is saved");
							return true;
						}
					}
					System.out.println("The name is not saved");
					return false;
				}
				System.out.println("The length is not valid");
				return false;
			}
			System.out.println("The given names are not valid");
		}
		System.out.println("The info is null");
		return false;
	}

	// findByName method;
	public ResumeDto findByName(String byName) {
		if (byName != null && byName.length() > 3) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if (resume[i].getName().equals(byName)) {
						System.out.println("Name is found");
						return resume[i];
					}
				}
			}
			System.out.println("The name is not found");
			return null;
		}
		System.out.println("Byname is valid");
		return null;
	}

	// findByEmail;
	public ResumeDto findByEmail(String byEmail) {
		if (byEmail != null && byEmail.length() > 3) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if (resume[i].getEmail().equals(byEmail)) {
						System.out.println("Email is found");
						return resume[i];
					}
				}
			}
			System.out.println("Email is not found");
			return null;
		}
		System.out.println("ByEmail is valid");
		return null;
	}

	// updating degree by name;
	public ResumeDto updateDegreeByName(String name, String qualification) {
		if (name != null && name.length() > 2) {
			System.out.println("The name is valid");

			if (qualification != null && qualification.length() > 2) {
				System.out.println("The space is valid");

				for (int i = 0; i < resume.length; i++) {
					if (resume != null) {
						if (resume[i].getName().equals(name)) {
							resume[i].setQualification(qualification);
							System.out.println("The qualification is updated succesfully");
							return resume[i];
						}
					}
				}
				System.out.println("The Qualification name is not updated");
				return null;

			}
			System.out.println("The qualification is not valid");
			return null;
		}
		System.out.println("The name is not valid");
		return null;
	}

	public ResumeDto updatePhoneNumberByEmail(String email, long phoneNumber) {
		if (email != null && email.length() > 2) {
			System.out.println("Email is valid");

			if (phoneNumber >= 7) {
				System.out.println("The space is valid");

				for (int i = 0; i < resume.length; i++) {
					if (resume != null) {
						if (resume[i].getEmail().equals(email)) {
							resume[i].setPhoneNumber(phoneNumber);
							System.out.println("The phone number " + phoneNumber + " updated succesfully");
							return resume[i];
						}
					}
				}
				System.out.println("Phone number is not updated");
				return null;

			}
			System.out.println("Number is not valid in length");
			return null;
		}
		System.out.println("The mail is not valid");
		return null;
	}

	public boolean deleteByName(String name) {
		if (name != null & name.length() > 3) {
			System.out.println("Name is valid");
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if (resume[i].getName().equals(name)) {
						resume[i] = null;
						System.out.println("The name " + name + " deleted succesfully");
						return true;
					}
				}

			}
			System.out.println("Thename " + name + " deletion is unsuccessful");
			return false;
		}
		System.out.println("Name is not valid");
		return false;
	}

	public ResumeDto[] readAllResume() {
		return resume;
	}
}
