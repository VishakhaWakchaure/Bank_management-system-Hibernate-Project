package com.jsp.controller.Account;
import com.jsp.dto.Account;
import com.jsp.service.AccountService;

public class DeleteAccount {

		public static void main(String[] args) {

			AccountService accountService = new AccountService();
			Account account = accountService.deleteAccount(10);

			if (account != null)
				System.out.println("Account Record Deleted");
		}
}
