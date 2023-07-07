package com.jsp.controller.Account;
import com.jsp.dto.Account;
import com.jsp.dto.Customer;
import com.jsp.service.AccountService;
import com.jsp.service.CustomerService;

public class SaveAccount {

		public static void main(String[] args) {

			CustomerService customerService = new CustomerService();
			Customer customer1 = customerService.getByIdCustomer(5);
			Customer customer2 = customerService.getByIdCustomer(6);
			Customer customer3 = customerService.getByIdCustomer(7);
			Customer customer4 = customerService.getByIdCustomer(8);

			Account account1 = new Account();
			account1.setIfsc("SBI123");
			account1.setBalance(0);
			account1.setAccount_no("145IDK369");
			account1.setCustomer(customer1);

			Account account2 = new Account();
			account2.setIfsc("SBI123");
			account2.setBalance(0);
			account2.setAccount_no("ABC753LOL");
			account2.setCustomer(customer2);

			Account account3 = new Account();
			account3.setIfsc("SBI123");
			account3.setBalance(0);
			account3.setAccount_no("486ASD153");
			account3.setCustomer(customer3);

			Account account4 = new Account();
			account4.setIfsc("SBI123");
			account4.setBalance(0);
			account4.setAccount_no("xD69DxD");
			account4.setCustomer(customer4);

			AccountService accountService = new AccountService();
			Account account5 = accountService.saveAccount(account1);
			if (account5 != null)
				System.out.println("Account ID" + account5.getId() + " Added");

			Account account6 = accountService.saveAccount(account2);
			if (account6 != null)
				System.out.println("Account ID " + account6.getId() + " Added");

			Account account7 = accountService.saveAccount(account3);
			if (account7 != null)
				System.out.println("Account ID " + account7.getId() + " Added");

			Account account8 = accountService.saveAccount(account4);
			if (account8 != null)
				System.out.println("Account ID " + account8.getId() + " Added");

		}
	}

