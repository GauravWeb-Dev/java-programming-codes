
public class LetterP {

	public static void main(String[] args) {
		  int n = 16;
		   
		   for(int i=0;i<n;i++) {
			    
			   
			  
			   
			   //for Letter P
			   for(int j=0;j<n;j++) {
				   
				   if( ((j==n/4) && (i>=n/4) && (i<=3*n/4) ) ||
					   ((i==n/4) && (j>=n/4) && (j<3*n/4)) ||
					   ((i==(n-1)/2) && (j>=n/4) && (j<3*n/4)) ||
					   ((j==3*n/4) && (i>n/4) && (i<(n-1)/2))) {
					   
					   System.out.print("*");
				   }
				   else {
					   System.out.print(" ");
				   }
				   
			   }
			   System.out.println();
		   }

		}


}
