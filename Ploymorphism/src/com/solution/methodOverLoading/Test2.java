package com.solution.methodOverLoading;

public class Test2 {
     
	public void methodOne() {
		System.out.println("Zero args method");
	}
	
	public void methodOne(long c) {
		System.out.println("long method");
		System.out.println(c);
	}
	public void methodOne(int x) {
		System.out.println("int method");
		System.out.println(x);
	}
	
	
	public void methodOne(float f) {
		System.out.println(f);
	}
	
	public static void main(String[] args) {
          Test2 t = new Test2();
          
          t.methodOne(100);
          t.methodOne(12.5f);
          t.methodOne('a');
	}

}
