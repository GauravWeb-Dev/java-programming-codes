import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
        int r = 101;
        
        int [] num = new int[r];
        
        for(int i=0;i<r;i++) {
        	
        	num[i] = i ;
        	
        }
        
        System.out.println(Arrays.toString(num));
		
		
        for(int i=0;i<num.length;i++) {
        	if(num[i] %10 == 0) {
        		System.out.println(num[i]);
        	}
        }
        
		
	}

}
