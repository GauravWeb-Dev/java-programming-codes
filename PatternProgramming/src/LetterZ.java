
public class LetterZ {

	public static void main(String[] args) {
	   int n = 11;
	   
	   for(int i=0;i<n;i++) {
		   
		   //letterZ
		   for(int j=0;j<n;j++) {
			   
			   if( ((i==n/4) && (j>=n/4) && (j<=3*n/4)) ||
			      ((i==3*n/4) && (j>=n/4) && (j<=3*n/4)) ||
			      ((i+j==n-1) && (j>=n/4) && (j<=3*n/4))) {
				   
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
