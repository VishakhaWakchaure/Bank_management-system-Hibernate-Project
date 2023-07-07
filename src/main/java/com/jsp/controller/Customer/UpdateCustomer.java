package com.jsp.controller.Customer;
import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;
public class UpdateCustomer {

		public static void main(String[] args) {

			Customer customer = new Customer();
			customer.setName("Manish");
			customer.setStatus("Approved");

			CustomerService customerService = new CustomerService();
			Customer customer2 = customerService.updateCustomer(customer, 8);
			if (customer2 != null)
				System.out.println("Customer Record Updated");
		}
}
