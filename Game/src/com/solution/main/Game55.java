package com.solution.main;

import java.util.Scanner;

import java.util.Random;

class User55 {
	public String UserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please select your option \n1.stone\n2.paper\n3.scissor");
		System.out.println("Enter your Choice ::");
		int User55 = sc.nextInt();
		String User55Choice = "";
		if (User55 == 1) {

			User55Choice = "stone";
		} else if (User55 == 2) {
			User55Choice = "paper";
		} else if (User55 == 3) {
			User55Choice = "scissor";
		} else {
			System.out.println("INvalid choice");
		}
		return User55Choice;
	}

}

class Comp55 {

	public String Comp55Input() {
		String[] s = { "stone", "paper", "scissor" };
		Random r = new Random();
		String Comp55 = s[r.nextInt(3)];
		System.out.println("Comp55uter's coice :" + Comp55);
		return Comp55;

	}
}

class Decision {
	int UserScore = 0;
	int CompScore = 0;

	public void decision(String User55Choice, String Comp55Choice) {
//		User55 u = new User55();
//		Comp55 c = new Comp55();
//		String User55Choice = u.User55Input();
//		String Comp55Choice = c.Comp55Input();
		if ((User55Choice == "stone" && Comp55Choice == "paper") || (User55Choice == "paper" && Comp55Choice == "scissor")
				|| (User55Choice == "scissor" && Comp55Choice == "stone")) {
			System.out.println("Comp55uter is winner");
			CompScore++;
		} else if ((User55Choice == "paper" && Comp55Choice == "stone")
				|| (User55Choice == "scissor" && Comp55Choice == "paper")
				|| (User55Choice == "stone" && Comp55Choice == "scissor")) {
			System.out.println("User55 is winner");
			UserScore++;
		} else {
			System.out.println("Game is tie");
		}
		System.out.println("Comp55uter score is " + CompScore + "\nUser55 score is " + UserScore);
	}
}

class Start55 {
	
	Decision d = new Decision();
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome------");
		System.out.println("Enter no of rounds :");
		int noRounds = sc.nextInt();
		User55 u = new User55();
		Comp55 c = new Comp55();
		Decision d = new Decision();
		boolean flag = true;
		int i=0;
		while (flag) {
			String User55Choice = u.User55Input();
			String Comp55Choice = c.Comp55Input();
			d.decision(User55Choice, Comp55Choice);
			i++;
			if (i >= noRounds) {
				flag = false;
			}
			
		}

		
	}
	public void rule() {
		if (d.UserScore > d.CompScore) {
			System.out.println("User55 is wone by " + d.UserScore + "rounds");
		} else if (d.CompScore > d.UserScore) {
			System.out.println("Computer is won by " + d.CompScore + "ronds");
		} else {
			System.out.println("This game is tie because of same score");
		}

	}	

}

public class Game55 {

	public static void main(String[] args) {

		Start55 s = new Start55();
		s.start();

	}

}