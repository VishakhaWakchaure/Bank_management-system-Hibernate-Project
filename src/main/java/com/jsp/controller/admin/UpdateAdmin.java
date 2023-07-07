package com.jsp.controller.admin;
import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class UpdateAdmin {

		public static void main(String[] args) {

			Admin admin = new Admin();
			admin.setName("Advaith");
			admin.setEmail("advaith@mail.com");
			admin.setPassword("adv@jaejnfe");

			AdminService adminService = new AdminService();
			Admin admin2 = adminService.updateAdmin(admin, 2);
			if (admin2 != null)
				System.out.println("Admin Record Updated");
		}


}
