package com.solution.main;

class Parent {
	 int x =10;
	public static void property() {
		System.out.println("Gold+cash+land");
	}

	 public  void marry() {
		System.out.println("Relative girl only u should marry!!!");
	}
}

class Child extends Parent {
	
	int x = 20;
	@Override
      public  void marry(){
		System.out.println("I want to marry Deepika!!!");
	}
	
	
}

public class Test {

	public static void main(String[] args) {
         Parent p = new Parent();
         p.marry();
         
         Child c = new Child();
         c.marry();
         c.property();
       //  c.property();
         Parent pc = new Child();
         pc.marry();//override  //child Object refference
         System.out.println(pc.x); // Parent refference
         pc.property();// Parent refference
       
        
         
         
         
		
	}

}