package com.solution.main;

abstract class Bank {
	public abstract void withDreawn();

	public abstract void deposit(int balance);

	public abstract void balanceCheck();

	public abstract void miniStatement();

	public abstract void insurance();
}

class SBI extends Bank {
	int balance = 1000;

	public void withDreawn() {
       
	}

	public void deposit(int balance) {
	    this.balance += balance;
	}

	public void balanceCheck() {

	}

	public void miniStatement() {
	}

	public void insurance() {
	}

}

abstract class BOI extends Bank {
	public abstract void loan();

}

class BOISubBranch extends BOI {

	public void loan() {

	}

	public void withDreawn() {

	}

	public void deposit(int balance) {

	}

	public void balanceCheck() {

	}

	public void miniStatement() {

	}

	public void insurance() {
		// TODO Auto-generated method stub

	}

}

public class TestApp2 {

	public static void main(String[] args) {

	}

}
