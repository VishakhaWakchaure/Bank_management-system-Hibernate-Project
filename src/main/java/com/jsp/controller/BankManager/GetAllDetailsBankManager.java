package com.jsp.controller.BankManager;
import java.util.List;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;
public class GetAllDetailsBankManager {

		public static void main(String[] args) {

			BankManagerService bankManagerService = new BankManagerService();
			List<BankManager> bankManagers = bankManagerService.getAllBankManagers();
			for (BankManager bankManager : bankManagers) {
				System.out.println("==============================================================");
				System.out.println("BankManager ID       : " + bankManager.getId());
				System.out.println("BankManager Name     : " + bankManager.getName());
				System.out.println("BankManager Email    : " + bankManager.getEmail());
				System.out.println("BankManager Password : " + bankManager.getPassword());
				System.out.println("BankManager Status   : " + bankManager.getStatus());
			}
		}
}
