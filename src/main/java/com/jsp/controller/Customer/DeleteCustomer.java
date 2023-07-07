package com.jsp.controller.Customer;
import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class DeleteCustomer {

		public static void main(String[] args) {

			// Cannot delete coz of parent row

			CustomerService customerService = new CustomerService();
			Customer customer = customerService.deleteCustomer(1);

			if (customer != null)
				System.out.println("Customer Record Deleted");
		}
}
