/**
 * Exercise1:Create Person and Account Class as shown below in class diagram. Ensure minimum balance of INR 500 in a bank account is available.
 * @author Arun cibi
 *
 */
package com.cg.newbankacc;

public class Newbankaccount {
	 private long accno;
	    private String name;
	    private String acctype;
	    private double balance;
		/**
		 * @return the accno
		 */
		public long getAccno() {
			return accno;
		}
		/**
		 * @param accno the accno to set
		 */
		public void setAccno(long accno) {
			this.accno = accno;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the acctype
		 */
		public String getAcctype() {
			return acctype;
		}
		/**
		 * @param acctype the acctype to set
		 */
		public void setAcctype(String acctype) {
			this.acctype = acctype;
		}
		/**
		 * @return the balance
		 */
		public double getBalance() {
			return balance;
		}
		/**
		 * @param balance the balance to set
		 */
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void deposit(double amount)
		{
			this.balance=getBalance()+amount;
		}
		public void withdraw(double amount)
		{
			this.balance=getBalance()-amount;
		}
		
	   
	   
}
