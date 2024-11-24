package com.solution.methodOverLoading;


class Calculator{
	
	 void add(int x , int y) {
		System.out.println(x+y);
	}
	
	public void add(int x,int y,int z) {
		int sum = x+y+z;
		
		System.out.println(sum*10);
	}
	
	public void add(int x,float f) {
		System.out.println(x+f);
	}
	
	public void add(float x,float f) {
		System.out.println(x+f);
	}
	
	
	

		
}

public class Test {

	public static void main(String[] args) {
          
		Calculator c1 = new Calculator();
		c1.add(10, 20);
		
		c1.add(10, 20, 30);
		
		c1.add(10, 12.5f);
		
		
		
		
	}

}
