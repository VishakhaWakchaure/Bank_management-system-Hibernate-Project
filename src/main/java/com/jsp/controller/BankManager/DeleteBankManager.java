package com.jsp.controller.BankManager;
import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;
public class DeleteBankManager {

		public static void main(String[] args) {

			// Cannot delete coz of parent row

			BankManagerService bankManagerService = new BankManagerService();
			BankManager bankManager = bankManagerService.deleteBankManager(2);
			if (bankManager != null)
				System.out.println("Bank Manager Deleted");
		}
}
