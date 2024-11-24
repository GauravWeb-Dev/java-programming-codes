package com.solution.methodOverLoading;

class Test5 {
	public void methodOne(String s) {
		System.out.println("String arg method");
	}

	public void methodOne(StringBuilder sb) {
		System.out.println("StringBuilder arg method");
	}

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.methodOne("sachin");
		t.methodOne(new StringBuilder("sachin"));
	//	t.methodOne(null);// CE::Ambigous b/w String and StringBuilder
	}
}