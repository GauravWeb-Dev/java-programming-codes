package com.solution.main;
class School{
	
	public void play() {
		System.out.println("Students are playing cricket");
	}
}

class Student extends School{
	
   @Override
   public void play() {
		System.out.println("Students are playing games");
	}
	
}


public class Launch {

	public static void main(String[] args) {
       
	//	Student.play();
		
		School s = new Student();
		s.play();
	}

}
