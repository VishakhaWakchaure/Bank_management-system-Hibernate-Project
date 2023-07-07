package com.jsp.controller.admin;
import com.jsp.dto.Admin;
import com.jsp.service.AdminService;
public class DeleteAdmin {

		public static void main(String[] args) {

			// Cannot delete coz of parent row

			AdminService adminService = new AdminService();
			Admin admin = adminService.deleteAdmin(2);
			if (admin != null)
				System.out.println("Admin Record Deleted");
		}
}
