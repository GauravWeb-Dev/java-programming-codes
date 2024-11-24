
public class Test2 {
	static int i =0;
     public static void methodOne() {
    	   System.out.println(i);
    	   i++;
    	   
    		   methodOne();
    	   
     }
	public static void main(String[] args) {
        methodOne();  
		
		
	}

}
