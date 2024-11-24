package com.solution.main;

import java.util.Scanner;
import java.util.Random;

// Paper stone  = Paper
//  paper scissor = scissor
//  Stone scissor = stone
class User{
	
	public String userChoise(int user) {
		 
		String[] s = { null, "stone", "paper", "scissor" };
		
		String userChoise = s[user];
		
		
		return userChoise;
	}
}
class Comp99{
     public String compChoise() {
    	 Random r = new Random();

 		int comp = r.nextInt(3);
 		

 		String[] s1 = { "stone", "paper", "scissor" };
 		
 		return s1[comp];
 		
     }
}

class Game99{
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********Welcome to Stone Paper Scissor********");
		System.out.println("Please Select your chiose \n1.Stone\n2.Paper\n3.Scissor");

		// User selection code
		System.out.print("Your choise :: ");
		int user = sc.nextInt();
		
		User u1 = new User();
		String userChoise= u1.userChoise(user);
		
		Comp99 c1 = new Comp99();
		String compChoise = c1.compChoise();
		
		Game99 g1 = new Game99();
		g1.decision(userChoise, compChoise);
		
		
		System.out.println("\nUser's Choise :: " + userChoise);
		System.out.println("Comp's Choise :: " + compChoise);
	}
	
	public void decision(String userChoise , String compChoise) {
		if ((userChoise == "paper" && compChoise == "stone") || 
				(userChoise == "stone" && compChoise == "scissor")||
				(userChoise == "scissor" && compChoise == "paper")) {
				
				System.out.println("User won the Game");
				
				
			} else if ((userChoise == "paper" && compChoise == "scissor")|| 
					   (userChoise == "stone" && compChoise == "paper")  || 
					   (userChoise == "scissor" && compChoise == "stone")) {
				    
				System.out.println("Comp won the Game");

			}
			else {
				System.out.println("The Game is tie");
			}

	}
}
public class Test {

	public static void main(String[] args) {

     Game99 g1 = new Game99();
     g1.start();

	}

}
