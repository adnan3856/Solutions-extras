package com.lti.banks;
public class Bank {

	int totalAmount = 10000;
	int transactionDetails[][] = new int[5][3];
	
	public int withdraw(int amount) {
		System.out.println("Withdraw of amount " + amount + " is done.");
		return totalAmount -= amount;
	}
	
	public int deposit(int amount) {
		System.out.println("Deposit of amount " + amount + " is done.");
		return totalAmount += amount;
	}
	
	public void checkBalance() {
		System.out.println(totalAmount);
	}
	
	public void transaction() {
		System.out.println("Transaction Details: ");
		System.out.println("Withdraw \t Deposit \t Balance");
		System.out.println("__________________________");
		for(int i=0;i< 5;i++) {
				System.out.println(transactionDetails[i][0]+" \t \t" +transactionDetails[i][1] +" \t \t" +transactionDetails[i][2]);
		}
	}
}


