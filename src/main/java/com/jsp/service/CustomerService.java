package com.jsp.service;
import java.util.List;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {

		CustomerDao customerDao = new CustomerDao();

		// Save Customer
		public Customer saveCustomer(Customer customer) {
			if (customer != null) {
				customer.setStatus("Unapproved");
			}
			return customerDao.saveCustomer(customer);
		}

		// Get By Id Customer
		public Customer getByIdCustomer(int id) {
			return customerDao.getByIdCustomer(id);
		}

		// Update Customer
		public Customer updateCustomer(Customer customer, int id) {
			Customer customer2 = customerDao.getByIdCustomer(id);

			if (customer.getName() != null)
				customer2.setName(customer.getName());
			if (customer.getStatus() != null)
				customer2.setStatus(customer2.getStatus());

			if (customer2 != null) {
				customer2.setStatus("Unapproved");
				return customerDao.updateCustomer(customer2);
			}
			return null;
		}

		// Delete Customer
		public Customer deleteCustomer(int id) {
			Customer customer = customerDao.getByIdCustomer(id);
			if (customer != null)
				customerDao.deleteCustomer(customer);

			return null;
		}

		// Get All Customers
		public List<Customer> getAllCustomers() {
			return customerDao.getAllCustomers();
		}
}
