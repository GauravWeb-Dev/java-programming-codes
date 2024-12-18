package com.solution.service;

class Parent {
	static int i = 10;
	static {
		methodOne();
		System.out.println("Parent class static block");
	}

	public static void methodOne() {
		System.out.println(j);
	}

	public static void main(String[] args) {
		methodOne();
		System.out.println("Parent class main()");
	}

	static int j = 20;
}

class Child extends Parent {
	static int x = 100;
	static {
		methodTwo();
		System.out.println("Child class static block");
	}

	public static void methodTwo() {
		System.out.println(y);
	}

	public static void main(String... args) {
		methodTwo();
		System.out.println("Child class main()");
	}

	static int y = 20;
}