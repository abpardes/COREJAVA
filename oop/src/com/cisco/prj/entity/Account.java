package com.cisco.prj.entity;

public class Account {
	private String accNo; // instance variable ==> heap
	private double balance; // instance variable ==> heap
	private static int count = 0; // class variable ==> metaspace
	
	// default constructor
	public Account() {
		this.accNo = "NA";
		this.balance = 0.0;
		count++;
	}
	
	// parameterized constructor
	public Account(String no, double initAmt) {
		this.accNo = no;
		this.balance = initAmt;
		count++;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	// class method ==> context is class not object
	public static int getCount() {
		return count;
	}
	
	public String getAccNo() {
		return this.accNo;
	}

	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		return this.accNo.equals(acc.accNo);
	}
}
