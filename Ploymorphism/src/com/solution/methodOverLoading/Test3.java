package com.solution.methodOverLoading;

public class Test3 {

	public void methodOne(int i, float f) {
		System.out.println("Int,Float arg method");
	}

	public void methodOne(float f, int i) {
		System.out.println("Float,Int arg method");
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.methodOne(10, 10.5f);
		t.methodOne(10.5f, 10);
		//t.methodOne(10, 10);// CE
	//	t.methodOne(10.5f, 10.5f);// CE

	}

}
