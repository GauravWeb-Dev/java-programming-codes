import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {

		String s1 = new String("Sachin");
		char c1 =s1.charAt(3);
		
		System.out.println(c1);
        
	//	System.out.println(s1.charAt(-23));
		
		System.out.println(s1.length());
        
        String s2 = "Sachin";
        String s3 = "sachin";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        
        
        String s4 = "SachinTendulkar";
        
        System.out.println(s4.substring(6));
        
        System.out.println(s4.substring(6,10));
        
        
        String s6 = "banana";
        
        System.out.println(s6.replace('a','i'));
        
       System.out.println(s6.toUpperCase()); 
       
       System.out.println(s6.toLowerCase());
       
       String s7 = "          Virat Kohli       ";
       
       System.out.println(s7.trim());
       
       System.out.println(s6.indexOf('n'));
       
       System.out.println(s6.lastIndexOf('a'));
       
       
       String s9 = "SachinTendulkar";
       
       String [] c = s9.split("");
       
       for(int i=c.length-1 ; i>=0;i--) {
    	   System.out.print(c[i]);
       }
       
       System.out.println();
       System.out.println(Arrays.toString(c));
       
        StringBuilder sb = new StringBuilder(s9);
        System.out.println(sb.reverse());
        
        
        
    
       
      
      
      

	}

}
