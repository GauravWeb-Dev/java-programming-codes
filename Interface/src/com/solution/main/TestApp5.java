package com.solution.main;

interface Left {
	int x = 888;
}

interface Right {
	int x = 999;
}

 class Test3 implements Left, Right {
	public static void main(String... args) {
		System.out.println(Left.x);
		System.out.println(Right.x);
	}
}

public class TestApp5 {

}
