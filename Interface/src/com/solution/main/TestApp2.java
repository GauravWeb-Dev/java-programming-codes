package com.solution.main;

interface ISample{
	public void methodOne();
	public void methodTwo();
	
	//10 methods
}


abstract class SampleImpl implements ISample{
	public abstract void methodOne();
	//9 abstract methods
	  public void methodTwo() {
		
	}
}

class SampleClass extends SampleImpl{
	public void methodOne() {
		
	}

}
public class TestApp2 {

	public static void main(String[] args) {
         
	}

}