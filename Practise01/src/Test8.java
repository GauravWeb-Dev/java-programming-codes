import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age ");
		
		int age = sc.nextInt();
		
		if( age >= 21  && age <= 45) {
			System.out.println("your are eligible for this job");
		}
		else {
			System.out.println("you are not eligible");
		}
		
		
		
		
	}

}
