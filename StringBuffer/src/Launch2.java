
public class Launch2 {

	public static void main(String[] args) {
         
		StringBuffer sb = new StringBuffer("SachinTendulkar");//16
		
		sb.setCharAt(6, 'F');
		
		System.out.println(sb);
		
		byte b = 100;
		sb.append(b);
		
		short s = 2000;
		sb.append(s);
		
		sb.append(123456);
		
		sb.append(123456789l);
		
		sb.append(12.5f);
		
		sb.append(12345678.2345678);
		
		sb.append(true);
		
		sb.append('A');
		
		System.out.println(sb);
		sb.setLength(15);
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Virat");
		
		sb1.insert(5, "Kohli");
		
		System.out.println(sb1);
		
		sb1.delete(5, 9);
		System.out.println(sb1);
		
		
		sb1 = new StringBuffer("Hello World");
		                     
		
		sb1.reverse();
		
		System.out.println(sb1);
		
		
		StringBuffer sb3 = new StringBuffer();//16
		
		sb3.ensureCapacity(1000);
		
	 sb3.append("Good Morning").trimToSize();
		System.out.println(sb3.length());
		
		System.out.println(sb3.capacity());
		
		
		StringBuilder sb5 = new StringBuilder("Hello world");
		
		StringBuffer sb6 = new StringBuffer();
		sb.append("sachin").insert(6, "tendulkar").reverse().append("IND").delete(0, 4).reverse();
		System.out.println(sb);
		
		
	}

}
