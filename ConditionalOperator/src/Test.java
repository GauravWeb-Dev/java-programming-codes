
public class Test {

	public static void main(String[] args) {
         
		// if else
		
		int x = 10;
		if(x > 9) { 
			System.out.println(x);
		}
		else if(x==10) {
			
		}
		else if(x>100) {
			
		}
		else {
			
		}
		
		
		//Ternary operator
		
		//condition ? R1 : R2 ;
		
	      String s = (x > 9) ? "x is greater than 9" : "x is less than 9";
	      
	      int x1 = (x==10)? 100:101;
	      
	      
	      int y = (x > 9)? (x==10)? 100: 99 : 101;
	      
	      
	      
	      //Switch case
	      
	      char a = 'c';
	      
	      switch(a) {
	      case 97 :  System.out.println(a);
	    	  break;
	      case 98 : System.out.println(a);
	    	  break;
	      case 99 : System.out.println(a);
	    	  break;
	      case 100 : System.out.println(a);
	          break;
	    	  default: System.out.println("inavild");
	      
	     
	      }
	      
	      
	      int age = 22;
	      
	      if(age >= 21) {
	    	  if(age <=45) {
	    		  System.out.println("you are eligible for this job");
	    	  }
	    	  else {
	    		  System.out.println("you are too old for this job");
	    	  }
	      }
	      else {
	    	  System.out.println("you are not eligible for job");
	      }
	      
	      
	      
		
	}

}