package com.xworkz.bank.dao;

import com.xworkz.bank.custom.FailedToDeleteException;
import com.xworkz.bank.custom.FailedToUpdateException;
import com.xworkz.bank.custom.InvalidBankNameException;
import com.xworkz.bank.dto.BankDto;

public class BankDao {

	BankDto[] bank = new BankDto[10];

	public boolean save(BankDto dto) throws InvalidBankNameException {
		if (dto != null) {
			System.out.println("The dto is not null");
			if (dto.getBankName() != null) {
				if (dto.getBankName().length() > 1) {
					System.out.println("The bank name is valid");
					for (int i = 0; i < bank.length; i++) {
						if (bank[i] == null) {
							bank[i] = dto;
							System.out.println("The given bank name is saved");
							return true;
						}
					}
					System.out.println("The name is not saved");
					return false;
				}
				throw new InvalidBankNameException("The given name is invalid");
			}
		}
		System.out.println("The gieven dto is null");
		return false;
	}

	public BankDto updateByName(String bankName, String branch) throws FailedToUpdateException {
		if (bankName != null) {
			System.out.println("The given name is not null");
			if (branch != null && branch.length() > 4) {
				System.out.println("The branch is valid");
				for (int i = 0; i < bank.length; i++) {
					if (bank[i] != null) {
						if (bank[i].getBankName().equals(bankName)) {
							bank[i].setBranch(branch);
							System.out.println("Branch updated succesfully");
							return bank[i];
						}
					}
				}
				throw new FailedToUpdateException("Failed to update the branch");
			}
		}
		System.out.println("The given bank name is null");
		return null;
	}

	public boolean delete(String ifscCode) throws FailedToDeleteException {
		if (ifscCode != null && ifscCode.length() > 3) {
			System.out.println("The given ifscCode is valid");
			for (int i = 0; i < bank.length; i++) {
				if (bank[i] != null) {
					bank[i].getBranch().equals(ifscCode);
					System.out.println("Deleted successfully");
					return true;
				}
			}
			throw new FailedToDeleteException("Failed to delete");
		}
		System.out.println("The ifsc code is valid");
		return false;
	}

	public BankDto[] read() {
		return bank;

	}

}
