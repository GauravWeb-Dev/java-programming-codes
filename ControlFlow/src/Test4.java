
public class Test4 {

	public static void main(String[] args) {
       //Nested Loop
		
//		for(int i = 97 ; i < 108; i++) {
//			   char c =(char) i;
//			System.out.println(c);
//			
//			for(int j = 65 ; j < 70; j++) {
//				char c1 =(char) j;
//				System.out.println(c1);
//			}
//			System.out.println();
//		}
		
		
		for( int y = 0 ; y < 10; y++ ) {
		
			for(int x = 0 ; x <10 ;x++){
				
			 System.out.print(x); 
			}
			System.out.println();
				
		}
		
		
		int age = 70;
		
		if(age >= 21) {
			if(age <= 45) {
				System.out.println("you are eligible for job");
			}
			else {
				System.out.println("you are too old");
			}
		}
		else {
			System.out.println("You are under age");
		}
		
		
		
		
		
	}

}
