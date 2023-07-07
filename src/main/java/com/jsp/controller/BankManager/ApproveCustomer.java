package com.jsp.controller.BankManager;
import com.jsp.service.BankManagerService;

public class ApproveCustomer {

		public static void main(String[] args) {

			BankManagerService bankManagerService = new BankManagerService();
			bankManagerService.approveCustomerById(3, 6);

		}
}
