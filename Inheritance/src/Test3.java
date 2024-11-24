class A{
	int x =100;
}

class B extends A{
	
}

class C extends B{
	
}
public class Test3 {

	public static void main(String[] args) {
            
		  C  c1 = new C();
		  System.out.println(c1.x);
		
	}

}
