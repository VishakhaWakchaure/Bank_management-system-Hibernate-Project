package com.jsp.service;
import java.util.List;

import com.jsp.dao.BankManagerDao;
import com.jsp.dao.CustomerDao;
import com.jsp.dto.BankManager;
import com.jsp.dto.Customer;

public class BankManagerService {
	
		BankManagerDao bankManagerDao = new BankManagerDao();
		CustomerService customerService = new CustomerService();
		CustomerDao customerDao = new CustomerDao();

		// Save BankManager
		public BankManager saveBankManager(BankManager bankManager) {
			if (bankManager != null) {
				bankManager.setStatus("Unapproved");
			}
			return bankManagerDao.saveBankManager(bankManager);
		}

		// Get By Id BankManager
		public BankManager getByIdBankManager(int id) {
			return bankManagerDao.getByIdBankManager(id);
		}

		// Update BankManager
		public BankManager updateBankManager(BankManager bankManager, int id) {
			BankManager bankManager2 = bankManagerDao.getByIdBankManager(id);

			if (bankManager.getName() != null)
				bankManager2.setName(bankManager.getName());
			if (bankManager.getEmail() != null)
				bankManager2.setEmail(bankManager.getEmail());
			if (bankManager.getPassword() != null)
				bankManager2.setPassword(bankManager.getPassword());
			if (bankManager.getStatus() != null)
				bankManager2.setStatus(bankManager.getStatus());

			if (bankManager2 != null) {
				bankManager2.setStatus("Unapproved");
				return bankManagerDao.updateBankManager(bankManager2);
			}

			return null;
		}

		// Delete BankManager
		public BankManager deleteBankManager(int id) {
			BankManager bankManager = bankManagerDao.getByIdBankManager(id);
			if (bankManager != null)
				return bankManagerDao.deleteBankManager(bankManager);

			return null;
		}

		// Get All BankManagers
		public List<BankManager> getAllBankManagers() {
			return bankManagerDao.getAllBankManagers();
		}

		// Approve Customer By Id
		public void approveCustomerById(int bm_id, int customer_id) {
			BankManager bankManager = bankManagerDao.getByIdBankManager(bm_id);
			Customer customer = customerService.getByIdCustomer(customer_id);

			if (bankManager.getStatus().equals("Approved")) {
				if (bankManager.getId() == customer.getBankManager().getId()) {
					customer.setStatus("Approved");
					customerDao.updateCustomer(customer);
				} else
					System.out.println("ID Didn't Matched");
			} else
				System.out.println("Get Approved First");
		}
}
