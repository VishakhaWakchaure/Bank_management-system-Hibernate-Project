package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Customer;

public class CustomerDao {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Save Record
		public Customer saveCustomer(Customer customer) {
			if (customer != null) {
				entityTransaction.begin();
				entityManager.persist(customer);
				entityTransaction.commit();
				return customer;
			}
			return null;
		}

		// Get By Id Record
		public Customer getByIdCustomer(int id) {
			return entityManager.find(Customer.class, id);
		}

		// Update Record
		public Customer updateCustomer(Customer customer) {
			if (customer != null) {
				entityTransaction.begin();
				entityManager.merge(customer);
				entityTransaction.commit();
				return customer;
			}
			return null;
		}

		// Delete Record
		public Customer deleteCustomer(Customer customer) {
			if (customer != null) {
				entityTransaction.begin();
				entityManager.remove(customer);
				entityTransaction.commit();
				return customer;
			}
			return null;
		}

		// Get All Records
		public List<Customer> getAllCustomers() {
			String sql = "select c from Customer c";
			Query query = entityManager.createQuery(sql);
			List<Customer> customers = query.getResultList();

			return customers;
		}

}
