package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
public class AdminDao {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Save Record
		public Admin saveAdmin(Admin admin) {
			if (admin != null) {
				entityTransaction.begin();
				entityManager.persist(admin);
				entityTransaction.commit();
				return admin;
			}
			return null;
		}

		// Get By Id Record
		public Admin getByIdAdmin(int id) {
			return entityManager.find(Admin.class, id);
		}

		// Update Record
		public Admin updateAdmin(Admin admin) {
			if (admin != null) {
				entityTransaction.begin();
				entityManager.merge(admin);
				entityTransaction.commit();
				return admin;
			}
			return null;
		}

		// Delete Record
		public Admin deleteAdmin(Admin admin) {
			if (admin != null) {
				entityTransaction.begin();
				entityManager.remove(admin);
				entityTransaction.commit();
				return admin;
			}
			return null;
		}

		// Get All Records
		public List<Admin> getAllAdmins() {
			String sql = "select a from Admin a";
			Query query = entityManager.createQuery(sql);
			List<Admin> admins = query.getResultList();
			return admins;

		}

}
