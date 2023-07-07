package com.jsp.controller.BankManager;
import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class UpdateBankManager {
	
	

		public static void main(String[] args) {

			BankManager bankManager = new BankManager();
			bankManager.setName("Sejauluuuu");
			bankManager.setEmail("sejauluuuu@mail.com");
			bankManager.setPassword("xyz123zyx");
			bankManager.setStatus("Approved");

			BankManagerService bankManagerService = new BankManagerService();
			BankManager bankManager2 = bankManagerService.updateBankManager(bankManager, 3);
			if (bankManager2 != null)
				System.out.println("Bank Manager Record Updated");
		}

}
