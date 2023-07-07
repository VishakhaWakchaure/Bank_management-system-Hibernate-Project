package com.jsp.controller.admin;
import java.util.List;

import com.jsp.dto.BankManager;
import com.jsp.service.AdminService;

public class UnViewAllApproved {

		public static void main(String[] args) {

			AdminService adminService = new AdminService();
			List<BankManager> bankManagers = adminService.viewAllUnapprovedBankManagers();
			for (BankManager bankManager : bankManagers) {
				System.out.println("=============================================================");
				System.out.println("BankManager ID       : " + bankManager.getId());
				System.out.println("BankManager Name     : " + bankManager.getName());
				System.out.println("BankManager Email    : " + bankManager.getEmail());
				System.out.println("BankManager Password : " + bankManager.getPassword());
				System.out.println("BankManager Status   : " + bankManager.getStatus());
			}
		}
}
