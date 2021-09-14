package com.lti.banks;

import java.util.Scanner;

public class ICICI extends Bank {
	Scanner scan = new Scanner(System.in);

	public ICICI() {
		super();
		System.out.println("Welcome to ICICI Bank");
		System.out.println("________________________");
	}

	public void onlineBanking() {
		int count=0;
		while (true) {
			int ch = 0;
			System.out.println("Enter your choice: ");
			System.out.println("1. Withdraw \n2.Deposit \n3.Check Balance \n4.Mini Statement \n5.Exit");
			ch = scan.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the amount to withdraw:");
				int WithAmount = scan.nextInt();
				super.transactionDetails[count][0] = WithAmount;
				super.transactionDetails[count][2] = super.withdraw(WithAmount);
				count++;
				break;
			case 2:
				System.out.println("Enter the amount to deposit:");
				int DepoAmount = scan.nextInt();
				super.transactionDetails[count][1] = DepoAmount;
				super.transactionDetails[count][2] = super.deposit(DepoAmount);
				count++;
				break;
			case 3:
				System.out.println("Balance:");
				super.checkBalance();
				break;
			case 4:
				System.out.println("Last 5 Transaction Details:");
				super.transaction();
				break;
			case 5:
				System.out.println("********** Thank you for banking with us *****************");
				System.exit(0);
				
			default:
				System.out.println("Please enter a valid input");
			}
		}
	}

}
