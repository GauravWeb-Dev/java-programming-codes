
public class Test12 {

	public static void main(String[] args) {
              
	StringBuffer sb = new StringBuffer();
	sb.append("123456789abcdefgh");
	
	System.out.println(sb.capacity());
	
	
	StringBuffer sb1 = new StringBuffer(100);
	
	System.out.println(sb1.capacity());//100
	
	
	StringBuffer sb2 = new StringBuffer("Akashay");//16+7
	
	System.out.println(sb2.capacity());
	
	
	StringBuilder sb3 = new StringBuilder("sachin");
    sb3.setCharAt(2, 'C');
    System.out.println(sb3);
    
    sb3.append(100);
    sb3.delete(1, 6);
    System.out.println(sb3);
    
    
    StringBuffer sb4 = new StringBuffer();
    sb4.append("sachin").insert(6, "tendulkar").reverse().append("IND").delete(0, 4).reverse();
    System.out.println(sb4);
	
    
    
	
	}

}
