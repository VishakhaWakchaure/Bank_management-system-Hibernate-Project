package com.jsp.controller.admin;
import com.jsp.service.AdminService;
public class ApprovedBankManager {
	
		public static void main(String[] args) {

			AdminService adminService = new AdminService();

			adminService.approveBankManagerById(2, 3);

		}

}
