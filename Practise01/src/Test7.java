
public class Test7 {

	public static void main(String[] args) {
         // conditional Operator
		   //1 if else
		
		int x = 19;
		
		if(x == 14) 
			System.out.println("x is greater than 14");
		
		else 
			System.out.println("X is less than 14");
		
		
		
	    int j = 12;
        int k = 12;
        
        boolean b3 = (--j != k--) | (k++  >= j++);
		  
        if(b3) {
        	System.out.println("True");
        }
        
        int age = 22;
        
        if(age < 21) 
        	System.out.println("you are minor");
        
        
        
        //Ternary Operator
          int a = 100;
          
          String ans = (a > 990)? "true" : "false";
          
          String ans1 = (a == 100)? (a > 99)? "true1" : "False1"  : (a > 990)? "true" : "false";
        
          System.out.println(ans);
          
          System.out.println((a > 990)? "true" : "false");
        
          
          // Switch Case
          
          int h = 100;
          
          switch(h) {
          
          case(10):
        	  System.out.println("Case 10 executed");
              break;
          case(100):
        	  System.out.println(" Case 100 executed");
              break;
          case(2):
        	  System.out.println(" Case 2 executed");
              break;
        	  
           default:
        	   System.out.println("Default Executed");
         
          }
          
          
        
     
		
	}

}
