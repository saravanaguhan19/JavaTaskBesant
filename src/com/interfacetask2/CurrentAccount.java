package com.interfacetask2;

public class CurrentAccount implements Account {

	@Override
	public void deposit() {
		System.out.println("the amount has been deposited in current account");
		
	}

	@Override
	public void withdraw() {
				System.out.println("the amount has been withdrawn from current account");
	}

	@Override
	public void calculateIntrest() {
		
		System.out.println("the intrest has been calculated in current account");
		
	}

	@Override
	public void viewBalances() {
		
		System.out.println("the amount of balance in current account is Rs.XXXXXX");
		
	}
	
	
	
	
}
