package com.solution.controller;

import java.util.Scanner;

import com.solution.service.BankImpl;

public class Start {
     
	public void startAtm() {
		System.out.println("***********Welcome to HDFC Bank ATM ************");
	    System.out.println("Select yout option\n 1.Balance Check \n 2.Deposit \n 3.WithDrawn \n 4.Send \n 5.Exit");
		
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter your option :: ");
	    int option = sc.nextInt();
	    
	    BankImpl hdfc = new BankImpl(5680);
	    
	    switch(option){
	    case 1:hdfc.balanceCheck();
	    	break;
	    case 2:hdfc.deposit();
	    	break;
	    case 3:hdfc.withdrawn();
	    	break;
	    case 4:hdfc.send();
	    	break;
	    case 5:System.out.println("Thank you for using Our ATM");
	    	break;
	    default:System.out.println("Invalid option !! please try Again");
	    }
	    
	
	}
}
