package com.solution.service;

class Sample {
	int i = 10;
	{
		
		methodOne();
		System.out.println("First instance block");
	}

	Sample() {
		System.out.println("Inside constructor");
	}

	public static void main(String... args) {
		Sample s = new Sample();
		s.methodOne();
	}

	public void methodOne() {
		System.out.println(j);
	}

	{
		System.out.println("Second instance block");
	}
	int j = 20;
}