package com.solution.main;

class Account{
	private double balance;
	private long accNo;
	private String name;
	private String ifsc;
	
	private boolean flag;
	
	public void getFlag(boolean flag) {
		this.flag=flag;
	}
	public boolean isFlag() {
		return flag;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAccNo(long accNo) {
		this.accNo=accNo;
	}
	
	public long getAccNo() {
		return accNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
	 return name;
    }
	
	public void setIfsc(String ifsc) {
		this.ifsc=ifsc;
	}
	
	public String getIfsc() {
	 return ifsc;
    }
	
	
}
public class Launch {

	public static void main(String[] args) {
          
		Account a1 = new Account();
		
		a1.setBalance(1000);
		a1.setName("Akshay");
		a1.setAccNo(1234567890);
		a1.setIfsc("SBI1001");
		
		
		System.out.println(a1.getName());
		System.out.println(a1.getBalance());
		System.out.println(a1.getAccNo());
	    System.out.println(a1.getIfsc());
		
		
	   
	    
	
	}

}