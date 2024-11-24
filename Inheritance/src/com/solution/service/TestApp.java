package com.solution.service;

class Parent99 {
	Parent99() {
		System.out.println(this.hashCode());
	}
}

class Child99 extends Parent99 {
	Child99() {
		System.out.println(this.hashCode());
	}
}

public class TestApp {
	public static void main(String... args) {
		Child99 c = new Child99();
		System.out.println(c.hashCode());
	}
}
