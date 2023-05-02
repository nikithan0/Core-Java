package com.xworkz.resume;

import com.xworkz.resume.dao.ResumeDao;
import com.xworkz.resume.dto.AddressDto;
import com.xworkz.resume.dto.ResumeDto;

public class ResumeInfo {

	public static void main(String[] args) {

		AddressDto obj = new AddressDto(12, "BTM", "Banglore", "Karnataka");
		AddressDto obj1 = new AddressDto(4, "Shanthi nagar", "Banglore", "Karnataka");
		AddressDto obj2 = new AddressDto(16, "Santa cruz", "Mumbai", "Maharashtra");
		AddressDto obj3 = new AddressDto(30, "Juhu", "Mumbai", "Maharashtra");

		ResumeDao dao = new ResumeDao();

		ResumeDto dto1 = new ResumeDto("Rakshitha", "rakshitha@gmail.com", 6728087627L, "11-9-2000", "B.Com", "Ramesh",
				obj);
		ResumeDto dto2 = new ResumeDto("Bhavya", "bhavya@gmail.com", 7637882908l, "13-10-1996", "MCA", "Sathish", obj1);
		ResumeDto dto3 = new ResumeDto("Anagha", "anagha@gmail.com", 8748083787l, "01-12-1995", "MBA", "Ramesh", obj2);
		ResumeDto dto4 = new ResumeDto("Blessy", "blessy@gmail.com", 7838758908l, "02-11-2001", "B.Sc", "Paul", obj3);
		ResumeDto dto5 = new ResumeDto("Karen", "karen@gmail.com", 9030764846l, "25-12-2001", "M.Sc", "Arun", obj);

		dao.saveResume(dto1);
		dao.saveResume(dto2);
		dao.saveResume(dto3);
		dao.saveResume(dto4);
		dao.saveResume(dto5);

		System.out.println("-----------------------------------------------------------------------------------------");

		ResumeDto dao1 = dao.findByName("Rakshitha");
		System.out.println(dao1);

		System.out.println("-----------------------------------------------------------------------------------------");

		ResumeDto dao2 = dao.findByEmail("anagha@gmail.com");
		System.out.println(dao2);

		System.out.println("-----------------------------------------------------------------------------------------");

		ResumeDto str = dao.updateDegreeByName("Bhavya", "MBBS");
		System.out.println(str);

		System.out.println("-----------------------------------------------------------------------------------------");

		ResumeDto str1 = dao.updatePhoneNumberByEmail("blessy@gmail.com", 8987865409l);
		System.out.println(str1);

		System.out.println("-----------------------------------------------------------------------------------------");

		boolean str2 = dao.deleteByName("Karen");
		System.out.println(str2);

		System.out.println("-----------------------------------------------------------------------------------------");

		ResumeDto[] resume = dao.readAllResume();
		for (int i = 0; i < resume.length; i++) {
			if (resume[i] != null) {
				System.out.println(resume[i]);
			}
		}
	}
}
