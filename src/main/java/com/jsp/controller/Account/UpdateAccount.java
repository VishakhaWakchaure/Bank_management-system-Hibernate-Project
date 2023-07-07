package com.jsp.controller.Account;
import com.jsp.dto.Account;
import com.jsp.service.AccountService;

public class UpdateAccount {


		public static void main(String[] args) {

			Account account = new Account();
			account.setAccount_no("78985ABCD");
			account.setBalance(125000);

			AccountService accountService = new AccountService();
			Account account2 = accountService.updateAccount(account, 4);

			if (account2 != null)
				System.out.println("Account Record Updated");
		}
}
