package com.jsp.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String account_no;
		private String ifsc;
		private double balance;

		@OneToOne
		@JoinColumn
		private Customer customer;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAccount_no() {
			return account_no;
		}

		public void setAccount_no(String account_no) {
			this.account_no = account_no;
		}

		public String getIfsc() {
			return ifsc;
		}

		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
}
