package com.abstractiontask2;

public class CurrentAccount extends BankAccount {

	public void deposit() {
		System.out.println("the ammount has been deposited in Current Account");
	}
	 public void withdraw() {
		 System.out.println("the ammount has been withdrawn from Current Account");
	 }
	 
	 public static void main(String[] args) {
			CurrentAccount obj = new CurrentAccount();
			obj.deposit();
			obj.withdraw();
		}
}
