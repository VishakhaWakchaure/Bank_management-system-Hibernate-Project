package com.jsp.service;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dao.BankManagerDao;
import com.jsp.dto.Admin;
import com.jsp.dto.BankManager;
public class AdminService {


		AdminDao adminDao = new AdminDao();
		BankManagerDao bankManagerDao = new BankManagerDao();
		BankManagerService bankManagerService = new BankManagerService();

		// Save Admin
		public Admin saveAdmin(Admin admin) {
			return adminDao.saveAdmin(admin);
		}

		// Get By Id Admin
		public Admin getByIdAdmin(int id) {
			return adminDao.getByIdAdmin(id);
		}

		// Update Admin
		public Admin updateAdmin(Admin admin, int id) {
			Admin admin2 = adminDao.getByIdAdmin(id);

			if (admin.getName() != null)
				admin2.setName(admin.getName());
			if (admin.getEmail() != null)
				admin2.setEmail(admin.getEmail());
			if (admin.getName() != null)
				admin2.setPassword(admin.getPassword());

			if (admin2 != null)
				return adminDao.updateAdmin(admin2);

			return null;
		}

		// Delete Admin
		public Admin deleteAdmin(int id) {
			Admin admin = adminDao.getByIdAdmin(id);

			if (admin != null)
				return adminDao.deleteAdmin(admin);

			return null;
		}

		// Get All Admins
		public List<Admin> getAllAdmins() {
			return adminDao.getAllAdmins();
		}

		// View All Unapproved BankManagers
		public List<BankManager> viewAllUnapprovedBankManagers() {

			List<BankManager> bankManagers = bankManagerService.getAllBankManagers();
			List<BankManager> bankManagers2 = new ArrayList<BankManager>();

			for (BankManager bankManager : bankManagers) {
				if (bankManager.getStatus().equals("Unapproved"))
					bankManagers2.add(bankManager);
			}
			return bankManagers2;

		}

		// View All Approved BankManagers
		public List<BankManager> viewAllApprovedBankManagers() {

			List<BankManager> bankManagers = bankManagerService.getAllBankManagers();
			List<BankManager> bankManagers2 = new ArrayList<BankManager>();

			for (BankManager bankManager : bankManagers) {
				if (bankManager.getStatus().equals("Approved"))
					bankManagers2.add(bankManager);
			}
			return bankManagers2;

		}

		// Approve Bank Manager By Id
		public void approveBankManagerById(int admin_id, int bm_id) {

			Admin admin = adminDao.getByIdAdmin(admin_id);
			BankManager bankManager = bankManagerService.getByIdBankManager(bm_id);

			if (admin.getId() == bankManager.getAdmin().getId()) {
				bankManager.setStatus("Approved");
				bankManagerDao.updateBankManager(bankManager);
			} else
				System.out.println("ID didn't Matched");

		}

}
