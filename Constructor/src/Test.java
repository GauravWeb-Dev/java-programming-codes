
final class Account{
	
	 Account() {
		System.out.println("Zero args Constructor");
	}
	
	Account(int x){
		System.out.println("Parametric Counstructor" + x);
	}
	
	 Account(int x , String name){
		System.out.println("Parametric Counstructor " + name);
	}
	

	
}



public class Test {
	Test(double d) {
		System.out.println("double argument constructor");
	}

	Test(int i) {
		this(10.5);
		System.out.println("int argument constructor");
	}

	Test() {
		this(10);
		System.out.println("no argument constructor");
	}
	public static void main(String[] args) {
   	
		
		 Test t = new Test();
		
		
		Account a1 = new Account();
		
		Account a2 = new Account(100);
		
		Account a3 = new Account(18 , "Virat");

	}

}