package com.solution.methodOverLoading;

class Test6 {
	public void methodOne() {
		System.out.println("No arg no return type");
	}

	public int methodOne(int x) {
		System.out.println("No arg with return type");
		return 5;
	}

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.methodOne();
		System.out.println(t.methodOne(3));
	}
}
