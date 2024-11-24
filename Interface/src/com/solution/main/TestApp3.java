package com.solution.main;
interface ITest1 {
	public void methodOne();
}

interface ITest2 extends ITest1{
	public void methodOne();

}

class Sample{
	  
}
class Test extends Sample implements ITest1,ITest2{
	public void methodOne() {
		
	}

	
}

public class TestApp3 {

	public static void main(String[] args) {
        Integer i = 120;
	}

}
