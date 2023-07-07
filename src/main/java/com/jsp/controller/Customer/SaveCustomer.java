package com.jsp.controller.Customer;
import com.jsp.dto.BankManager;
import com.jsp.dto.Customer;
import com.jsp.service.BankManagerService;
import com.jsp.service.CustomerService;

public class SaveCustomer {
	
		public static void main(String[] args) {

			BankManagerService bankManagerService = new BankManagerService();
			BankManager bankManager1 = bankManagerService.getByIdBankManager(3);
			BankManager bankManager2 = bankManagerService.getByIdBankManager(4);

			Customer customer1 = new Customer();
			customer1.setName("Gayatri");
			customer1.setStatus("Approved");
			customer1.setBankManager(bankManager1);

			Customer customer2 = new Customer();
			customer2.setName("Prasad");
			customer2.setStatus("Approved");
			customer2.setBankManager(bankManager1);

			Customer customer3 = new Customer();
			customer3.setName("Karuna");
			customer3.setStatus("Approved");
			customer3.setBankManager(bankManager2);

			Customer customer4 = new Customer();
			customer4.setName("Mahesh");
			customer4.setStatus("Approved");
			customer4.setBankManager(bankManager2);

			CustomerService customerService = new CustomerService();
			Customer customer5 = customerService.saveCustomer(customer1);
			if (customer5 != null)
				System.out.println("Customer " + customer5.getName() + " Added");

			Customer customer6 = customerService.saveCustomer(customer2);
			if (customer6 != null)
				System.out.println("Customer " + customer6.getName() + " Added");

			Customer customer7 = customerService.saveCustomer(customer3);
			if (customer7 != null)
				System.out.println("Customer " + customer7.getName() + " Added");

			Customer customer8 = customerService.saveCustomer(customer4);
			if (customer8 != null)
				System.out.println("Customer " + customer8.getName() + " Added");

		}
}
