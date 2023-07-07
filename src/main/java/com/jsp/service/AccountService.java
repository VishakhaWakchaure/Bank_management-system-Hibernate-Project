package com.jsp.service;
import java.util.List;

import com.jsp.dao.AccountDao;
import com.jsp.dto.Account;

public class AccountService {
	
		AccountDao accountDao = new AccountDao();

		// Save Account
		public Account saveAccount(Account account) {
			return accountDao.saveAccount(account);
		}

		// Get By Id Account
		public Account getByIdAccount(int id) {
			return accountDao.getByIdAccount(id);
		}

		// Update Account
		public Account updateAccount(Account account, int id) {
			Account account2 = accountDao.getByIdAccount(id);
			double amount = account2.getBalance();

			if (account.getIfsc() != null)
				account2.setIfsc(account.getIfsc());
			if (account.getAccount_no() != null)
				account2.setAccount_no(account.getAccount_no());
			if (account.getBalance() != 0) {
				account2.setBalance(account.getBalance());
			}

			if (account2 != null) {
				account2.setBalance(amount + 0);
				return accountDao.updateAccount(account2);
			}
			return null;
		}

		// Delete Account
		public Account deleteAccount(int id) {
			Account account = accountDao.getByIdAccount(id);

			if (account != null)
				return accountDao.deleteAccount(account);

			return null;
		}

		// Get All Accounts
		public List<Account> getAllRecords() {
			return accountDao.getAllAccounts();
		}

		// Deposit Money
		public Account depositMoney(int customer_id, int account_no, double amount) {
			return accountDao.depositMoney(customer_id, account_no, amount);
		}

		// Transfer Money
		public Account transferMoney(int customer_id, int sender, int reciever, double amount) {
			return accountDao.transferMoney(customer_id, sender, reciever, amount);
		}
}
