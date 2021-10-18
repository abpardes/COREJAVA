package com.cisco.prj.client;

import com.cisco.prj.entity.Account;

public class AccountExample {

	public static void main(String[] args) {
		Account rahulAcc = new Account();
		Account swethaAcc = new Account("SA130", 500); // paramerized constructor
		rahulAcc.deposit(9000);
		swethaAcc.deposit(8700);
		
		System.out.println("Rahul Account");
		System.out.println("No : " + rahulAcc.getAccNo());
		System.out.println("Balance: " + rahulAcc.getBalance());
		
		System.out.println("Swetha Account");
		System.out.println("No : " + swethaAcc.getAccNo());
		System.out.println("Balance: " + swethaAcc.getBalance());
	
		System.out.println("Count : " + Account.getCount());
		
		System.out.println("************");
		
		Account a1 = new Account("SB100",0.0);
		Account a2 = new Account("SB100",0.0);
		Account a3 = a1;
		
		if(a1 == a2) {
			System.out.println("a1 and a2 are same");
		}
		if(a1 == a3) {
			System.out.println("a1 and a3 are same");
		}
		if(a1.equals(a2)) {
			System.out.println("content is same");
		}
	}

}
