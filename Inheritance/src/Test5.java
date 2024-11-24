class Parent1 {
	
	Parent1() {
		super();
		System.out.println("Parent class constructor");
	}
}

class Child1 extends Parent1{

	Child1() {
		this(10);
		System.out.println("Child class constructor");
		
	}
	
	Child1(int x){
		
		System.out.println("parametric Child Constructor");
	}
}

public class Test5 {

	public static void main(String[] args) {
       
		//Parent1 p1 = new Parent1();
		
		Child1 c1 = new Child1();
		
		//Parent1 p2 = new Child1();
	}

}
