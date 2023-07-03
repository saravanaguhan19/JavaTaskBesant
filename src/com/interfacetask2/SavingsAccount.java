package com.interfacetask2;

public class SavingsAccount implements Account {

	@Override
	public void deposit() {
		System.out.println("the amount has been deposited in savings account");
		
	}

	@Override
	public void withdraw() {
				System.out.println("the amount has been withdrawn from savings account");
	}

	@Override
	public void calculateIntrest() {
		
		System.out.println("the intrest has been calculated in savings account");
		
	}

	@Override
	public void viewBalances() {
		
		System.out.println("the amount of balance in savings account is Rs.XXXXXX");
		
	}
}
