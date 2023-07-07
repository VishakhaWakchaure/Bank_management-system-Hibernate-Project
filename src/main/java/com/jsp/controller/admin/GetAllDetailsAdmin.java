package com.jsp.controller.admin;
import java.util.List;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class GetAllDetailsAdmin {

		public static void main(String[] args) {

			AdminService adminService = new AdminService();
			List<Admin> admins = adminService.getAllAdmins();
			for (Admin admin : admins) {
				System.out.println("================================================================");
				System.out.println("Admin Id       : " + admin.getId());
				System.out.println("Admin Name     : " + admin.getName());
				System.out.println("Admin email    : " + admin.getEmail());
				System.out.println("Admin password : " + admin.getPassword());
			}
		}
}
