package com.solution.main;

class Bank {
	private int balance;
	private String name;

	{
		 balance = 1000;
		 name = "Aniket";
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Bank() {
		System.out.println("bank class Constructor");
	}
}

public class Demo {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.getBalance());
		System.out.println(b.getName());
	}

}
