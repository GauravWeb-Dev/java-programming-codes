
public class Launch {

	public static void main(String[] args) {
         
		StringBuffer sb = new StringBuffer();//16
		
		int x = sb.capacity();
		
		System.out.println(x);
		
		sb.append("1234567890123456");//16
		sb.append('7');
		x = sb.capacity();
		
		
		
		System.out.println(x);
		
		StringBuffer sb1 = new StringBuffer("Hello");//16+5=21
		
		System.out.println(sb1.capacity());//
		System.out.println("length of sb1 :: "+sb1.length());
		
		
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println(sb2.capacity());
		
		
		
	}

}
