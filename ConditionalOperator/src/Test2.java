
public class Test2 {

	public static void main(String[] args) {
		/*
		 * 1 if else 2. ternary operator 3. switch case
		 * 
		 */
		int x = 5;
		if (x > 9) {

			System.out.println("X is greater than 9");

		} else if (x == 9) {
			System.out.println("x is equal to 9");
		}

		else if (x >= 8) {

		} else {
			System.out.println("X is less than 9");
		}

		int age = 20;

		if (age >= 21) {

			if (age <= 45) {
				System.out.println("you are eligible for this job");
			} else {
				System.out.println("you are too old for this job");
			}

		} else {
			System.out.println("you are too small for this job");
		}

		
		
		
		if (x > 9)
			System.out.println("X is greater than 9");
		else if (x == 9) 
			System.out.println("x is equal to 9");
		
		else if (x >= 8)
             System.out.println("x is 8");
		
		else 
			System.out.println("X is less than 9");
		

		
	}

}