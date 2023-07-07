package com.jsp.controller.Account;
import com.jsp.dto.Account;
import com.jsp.service.AccountService;

public class GetByIdAccount {
		public static void main(String[] args) {

			AccountService accountService = new AccountService();
			Account account = accountService.getByIdAccount(4);

			System.out.println("Account Id      :" + account.getId());
			System.out.println("Account Acc_no  :" + account.getAccount_no());
			System.out.println("Account Isfc    :" + account.getIfsc());
			System.out.println("Account Balance :" + account.getBalance());

		}
	}

