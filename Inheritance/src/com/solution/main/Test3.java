package com.solution.main;
class Parent1 {
	
//	Parent1(int x){
//		
//		System.out.println("Parent class args Constructor");
//	}
	
	
	
	
}

class Child1 extends Parent1{
  
	 Child1(){
		
		System.out.println("Child Class Constructor");
	}
	
	
}


public class Test3 {

	public static void main(String[] args) {
      
		Child1 c = new Child1();
		
	}

}
