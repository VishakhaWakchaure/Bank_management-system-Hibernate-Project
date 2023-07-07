package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.BankManager;
public class BankManagerDao {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Save Record
		public BankManager saveBankManager(BankManager bankManager) {
			if (bankManager != null) {
				entityTransaction.begin();
				entityManager.persist(bankManager);
				entityTransaction.commit();
				return bankManager;
			}
			return null;
		}

		// Get By Id Record
		public BankManager getByIdBankManager(int id) {
			return entityManager.find(BankManager.class, id);
		}

		// Update Record
		public BankManager updateBankManager(BankManager bankManager) {
			if (bankManager != null) {
				entityTransaction.begin();
				entityManager.merge(bankManager);
				entityTransaction.commit();
				return bankManager;
			}
			return null;
		}

		// Delete Record
		public BankManager deleteBankManager(BankManager bankManager) {
			if (bankManager != null) {
				entityTransaction.begin();
				entityManager.remove(bankManager);
				entityTransaction.commit();
				return bankManager;
			}
			return null;
		}

		// Get All Records
		public List<BankManager> getAllBankManagers() {
			String sql = "select b from BankManager b";
			Query query = entityManager.createQuery(sql);
			List<BankManager> bankManagers = query.getResultList();
			return bankManagers;
		}
}
