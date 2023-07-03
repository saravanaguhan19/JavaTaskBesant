package com.abstractiontask2;

public class SavingAccount  extends BankAccount{
	
	public void deposit() {
		System.out.println("the ammount has been deposited in Savings Account");
		
	}
	 public void withdraw() {
		 System.out.println("the ammount has been withdrawn from  Savings Account");
	 }
	 
	 public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		obj.deposit();
		obj.withdraw();
	}
}
