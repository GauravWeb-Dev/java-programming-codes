package com.solution.main;

public class Parameter{
	float length;
	float breadth;
	float radius;
	
	public void square() {
		System.out.println("The parameter of Square :: " + 4*length);
	}
	
	public void rectangle() {
		System.out.println("The parameter of rectangle :: " + 2*length+2*breadth);
	}
	
	public void circle() {
		System.out.println("The parameter of circle :: " + 2*Math.PI*radius);
	}
}
