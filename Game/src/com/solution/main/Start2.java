package com.solution.main;

import java.util.Random;
import java.util.Scanner;

//Write program for Rock , Paper , Scissor Game
   /*  
    *    rock       scissor   =  rock
    *    rock       paper     =  paper
    *    paper      scissor   =  scissor
    *    
    */ 

class Game{
	public void start() {
		System.out.println("****** Welcome to Rock,Paper,Scissor Game *****");
		System.out.println("This game has 5 rounds"+"\n whoever wins more no of rounds will win the game");
		comp c =  new comp();
		player p= new player();
		Rules r = new Rules();
          for(int i=1; i<=5 ;i++) {  
        	  System.out.println("Round no. "+i);
        	  String c1= c.compSelect();
        	  String p1=p.playerSelect();
              r.rule(c1,p1);
              System.out.println();
          }
        if(r.computerScore > r.playerScore) {
        	System.out.println("Computer Won this Game by winning " + r.computerScore +" Rounds");
        }
        else if(r.computerScore < r.playerScore) {
        	System.out.println("You Won this Game by winning " + r.playerScore +" Rounds");
        }
        else {
        	System.out.println("This game is tie because of same score");
        }
         
	}
}

class comp{
	//method for random selection of computer
	public String compSelect() {
		String[] s = {"Rock","Paper","Scissor"};
		Random r = new Random();
		String comp = s[r.nextInt(3)];
		System.out.println("Computer has already selected its option ");
	  //System.out.println(comp);
		return comp;
	}
}
class player{
	String player;
	
   public String playerSelect() {
	   Scanner sc= new Scanner(System.in);
	   System.out.print("Select your option\n"+"1 for Rock\n"+"2 for Paper\n"+
	                       "3 for Scissor\n"+"Enter your option : ");
	   int a = sc.nextInt();
	   switch(a){
		   case 1: player = "Rock";
		           break;
		   case 2: player = "Paper";
		           break;
		   case 3: player = "Scissor";
		           break;
		   default:
			   System.out.println("Invalid option !,Please try again");
			   playerSelect();
	   }
	  // System.out.println("player selected" + player);
	   return player;
   }

}

class Rules{
	int computerScore = 0;
	int playerScore = 0;
	
	
	public void rule(String comp ,String player) {
		if((comp.equals(player))) {
			System.out.println("its Draw ! both have Selected same option\n");
			
		}
		else if((comp.equals("Rock")) && ( player.equals("Scissor")) ||
				(comp.equals("Paper")) && ( player.equals("Rock"))  ||
				(comp.equals("Scissor")) && ( player.equals("Paper")))
		{
			System.out.println("Computer Won this Round\n");
			computerScore++;
		}
		else if((comp.equals("Rock")) && ( player.equals("Paper")) ||
				(comp.equals("Paper")) && ( player.equals("Scissor")) ||
				(comp.equals("Scissor")) && ( player.equals("Rock")))
		{
			System.out.println("Player Won this Round\n");
			playerScore++;
		}
		
		System.out.println("Computer Selected : "+ comp);
		System.out.println("     You Selected : "+ player);
		System.out.println("computer Score:" + computerScore +"\nPlayer Score:" + playerScore);
	}
	
}


public class Start2 {
	public static void main(String[] args){
		Game g = new Game();
	
		try {
		g.start();
	     }
	catch(Exception e){
		System.out.println("Exception Occoured");
		g.start();
	  }
	
	
	
    }
}

