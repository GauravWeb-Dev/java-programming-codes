import java.util.Scanner;
public class Calculator{
	
	public void add(int a , int b) {
		int sum  = a+b;
		System.out.println(sum);
	}
	
	public void sub (int a ,int b) {
		int sub = a-b;
		System.out.println(sub);
	}
	
	public void mul(int a , int b) {
		int mul = a*b;
		System.out.println(mul);
	}
	
	public void div(int a ,int b) {
		int div=a/b;
		System.out.println(div);
	}
	

	public static void main(String[] args) {
       
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.sub(50, 10);
		cal.mul(35, 2);
		cal.div(100,4);
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		cal.add(a, b);
		
	}
	
}

