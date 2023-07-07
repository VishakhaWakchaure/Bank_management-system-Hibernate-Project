package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Account;
import com.jsp.dto.Customer;
public class AccountDao {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Save Record
		public Account saveAccount(Account account) {
			if (account != null) {
				entityTransaction.begin();
				entityManager.persist(account);
				entityTransaction.commit();
				return account;
			}
			return null;
		}

		// Get By Id Record
		public Account getByIdAccount(int id) {
			return entityManager.find(Account.class, id);
		}

		// Update Record
		public Account updateAccount(Account account) {
			if (account != null) {
				entityTransaction.begin();
				entityManager.merge(account);
				entityTransaction.commit();
				return account;
			}
			return null;
		}

		// Delete Record
		public Account deleteAccount(Account account) {
			if (account != null) {
				entityTransaction.begin();
				entityManager.remove(account);
				entityTransaction.commit();
				return account;
			}
			return null;
		}

		// Get All Record
		public List<Account> getAllAccounts() {
			String sql = "select a from Account a";
			Query query = entityManager.createQuery(sql);
			List<Account> accounts = query.getResultList();
			return accounts;

		}

		// Deposit Money
		public Account depositMoney(int customer_id, int account_no, double amount) {
			Customer customer = entityManager.find(Customer.class, customer_id);
			Account account = entityManager.find(Account.class, account_no);
			if (customer != null) {

				if (account != null) {

					if (customer.getStatus().equals("Approved")) {

						if (account.getId() == customer.getId()) {
							account.setBalance(account.getBalance() + amount);
							updateAccount(account);
						} else
							System.out.println("ID Didn't Matched");

					} else
						System.out.println("Customer is Not Approved");

				} else
					System.out.println("Account ID Doesn't Exists");

			} else
				System.out.println("Customer ID Doesnt Exists");

			return account;

		}

		// Transfer Money
		public Account transferMoney(int customer_id, int sender, int reciever, double amount) {
			Customer customer = entityManager.find(Customer.class, customer_id);
			Account sender_account = entityManager.find(Account.class, sender);
			Account reciver_account = entityManager.find(Account.class, reciever);

			if (customer.getStatus().equals("Approved")) {

				if (sender == customer_id) {

					if (sender_account != null && reciver_account != null) {

						if (sender_account.getBalance() >= amount) {
							sender_account.setBalance(sender_account.getBalance() - amount);
							reciver_account.setBalance(reciver_account.getBalance() + amount);
							updateAccount(sender_account);
							updateAccount(reciver_account);

						} else
							System.out.println("Amount Tranfer cannot be more than Balance");

					} else
						System.out.println("Account ID Doesn't Exists");

				} else
					System.out.println("ID Doesn't Match");

			} else
				System.out.println("Customer is Not Approved, Get Approved First");
			return reciver_account;
		}

}
