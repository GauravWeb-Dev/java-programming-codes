import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. between 1 to 4");
		
		int x = sc.nextInt();
		if(x == 1) {
			System.out.println("you selected 1");
		}
		else if( x == 2) {
			System.out.println("you Selected 2");
		}
		else if(x ==3) {
			System.out.println("you selected 3");
		}
		else if(x ==4) {
			System.out.println("you selected 4");
		}
		else {
			System.out.println("your selection " + x);
		}
	}

}
