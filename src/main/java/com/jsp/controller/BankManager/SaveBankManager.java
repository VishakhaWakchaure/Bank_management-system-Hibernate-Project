package com.jsp.controller.BankManager;
import com.jsp.dto.Admin;
import com.jsp.dto.BankManager;
import com.jsp.service.AdminService;
import com.jsp.service.BankManagerService;

public class SaveBankManager {

		public static void main(String[] args) {

			AdminService adminService = new AdminService();
			Admin admin = adminService.getByIdAdmin(2);

			BankManager bankManager = new BankManager();
			bankManager.setName("nikita");
			bankManager.setEmail("nikita@mail.com");
			bankManager.setPassword("nikita@123");
			bankManager.setStatus("Approved");
			bankManager.setAdmin(admin);

			BankManager bankManager1 = new BankManager();
			bankManager1.setName("Mahesh");
			bankManager1.setEmail("mashesh@mail.com");
			bankManager1.setPassword("mahesh@123");
			bankManager1.setStatus("Approved");
			bankManager1.setAdmin(admin);

			BankManagerService bankManagerService = new BankManagerService();
			BankManager bankManager2 = bankManagerService.saveBankManager(bankManager);
			if (bankManager2 != null)
				System.out.println("Bank Manager " + bankManager2.getName() + " Added");

			BankManager bankManager3 = bankManagerService.saveBankManager(bankManager1);
			if (bankManager3 != null)
				System.out.println("Bank Manager " + bankManager3.getName() + " Added");
		}

}
