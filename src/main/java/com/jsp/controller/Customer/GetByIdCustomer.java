package com.jsp.controller.Customer;
import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class GetByIdCustomer { 

		public static void main(String[] args) {

			CustomerService customerService = new CustomerService();
			Customer customer = customerService.getByIdCustomer(6);

			System.out.println("Customer Id     : " + customer.getId());
			System.out.println("Customer Name   : " + customer.getName());
			System.out.println("Customer Status : " + customer.getStatus());
		}
}
