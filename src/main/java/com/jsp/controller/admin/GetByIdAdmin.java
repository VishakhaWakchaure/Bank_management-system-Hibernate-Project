package com.jsp.controller.admin;
import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class GetByIdAdmin {


		public static void main(String[] args) {

			AdminService adminService = new AdminService();
			Admin admin = adminService.getByIdAdmin(2);

			System.out.println("Admin Id       : " + admin.getId());
			System.out.println("Admin Name     : " + admin.getName());
			System.out.println("Admin email    : " + admin.getEmail());
			System.out.println("Admin password : " + admin.getPassword());
		}

}
