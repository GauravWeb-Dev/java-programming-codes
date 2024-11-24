package com.solution.methodOverLoading;

class Test4 {
	public void methodOne(Object o) {
		System.out.println("Object arg method");
	}
	public void methodOne(String s) {
		System.out.println("String arg method");
	}

	

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.methodOne("sachin");
		t.methodOne(new Test4());
		t.methodOne(null);
	}
}