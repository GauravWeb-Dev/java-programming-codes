package com.solution.main;

interface IBank {
	public static final float interest = 0;

	public void balanceCheck();

	public int withdrawn(int balance);

	public String miniStatement();

}

class BankImpl implements IBank {
    int balance  = 10000;
	public void balanceCheck() {
         System.out.println("your current balance is "+balance);
	}

	public int withdrawn(int balance) {
		
		this.balance -= balance;
		
		return balance;

	}

	public String miniStatement() {
		return "data of all transaction";

	}

	

}

public class TestApp {

	public static void main(String[] args) {

	}

}
