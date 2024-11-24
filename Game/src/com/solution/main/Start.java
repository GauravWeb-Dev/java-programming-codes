package com.solution.main;

import java.util.Random;
import java.util.Scanner;

class Game1{
	public void start() {
		System.out.println("**** Welcome to Rock, Paper, Scissor Game****");
	     Comp1 c =new Comp1();
	     String c1 = c.comp();
	     Player1 p = new Player1();
	     String p1 = p.player();
	     Rule1 r = new Rule1();
	     r.rule(c1, p1);
	     System.out.println("Computer's option : "+c1);
	     System.out.println("      Your option : "+p1);
	}
}
class Comp1{
	public String comp() {
		String[] a = {"Rock","Paper","Scissor"};
		Random r = new Random();
		String comp = a[r.nextInt(3)];
		System.out.println("Computer Already Choosed its option");
		return comp;
	}
}

class Player1{
	String player;
	public String player() {
		 System.out.println("Select option\n"+"1 for Rock\n"+
	                         "2 for Paper\n" +"3 for Scissor\n");
		 Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter your option : ");
		 int a = sc.nextInt();
		 switch(a) {
		 case 1: player = "Rock";
		         break;
		 case 2: player = "Paper";
	             break;
		 case 3: player = "Scissor";
	             break;
	    default:
		    System.out.println("Invalid Option ! , Please Try Again ");
				player(); 
		 }
		 
		return player;
	}
}

class Rule1{
	public void rule(String c , String p) {
		if((c.equals("Rock")) && (p.equals("Scissor")) ||
		   (c.equals("Paper")) && (p.equals("Rock"))  ||
		   (c.equals("Scissor")) && (p.equals("Paper"))) {
			System.out.println("Computer Won the Game");
		}
		else if((p.equals("Rock")) && (c.equals("Scissor")) ||
				(p.equals("Paper")) && (c.equals("Rock"))  ||
				(p.equals("Scissor")) && (c.equals("Paper"))) {
			System.out.println("You Won the Game");
		}
		else if(p.equals(c)){
			System.out.println("Sorry its Draw");
		}
		
	}
}
public class Start {

	public static void main(String[] args) {
		Game1 g = new Game1();
		g.start();
	}

}

