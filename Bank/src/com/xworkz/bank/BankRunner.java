package com.xworkz.bank;

import com.xworkz.bank.custom.FailedToDeleteException;
import com.xworkz.bank.custom.FailedToUpdateException;
import com.xworkz.bank.custom.InvalidBankNameException;
import com.xworkz.bank.dao.BankDao;
import com.xworkz.bank.dto.BankDto;

public class BankRunner {
	public static void main(String args[]) {

		BankDao dao = new BankDao();

		BankDto dto1 = new BankDto("Canara Bank", "Banglore", "SA568", 789320L);
		BankDto dto2 = new BankDto("HDFC", "J P Nagar", "RC890", 888903L);
		BankDto dto3 = new BankDto("ICICI", "Chikkapete", "Jk8930", 898238L);
		try {
			dao.save(dto1);
			dao.save(dto2);
			dao.save(dto3);
		} catch (InvalidBankNameException e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------------------------");

		BankDto dto4 = null;
		try {
			dto4 = dao.updateByName("Canara Bank", "Jayanagar");
		} catch (FailedToUpdateException e) {
			e.printStackTrace();
		}
		System.out.println(dto4);

		System.out.println("-----------------------------------------");

		Boolean delete = null;
		try {
			delete = dao.delete("Jk8930");
		} catch (FailedToDeleteException e) {
			e.printStackTrace();
		}
		System.out.println(delete);

		System.out.println("-----------------------------------------");

		BankDto[] read = dao.read();
		for (int i = 0; i < read.length; i++) {
			System.out.println(read[i]);
		}
	}
}
