package com.jsp.controller.Account;
import com.jsp.service.AccountService;

public class DepositeMoney {

		public static void main(String[] args) {

			AccountService accountService = new AccountService();
			accountService.depositMoney(6, 6, 125000);

		}
}
