
public class TestApp5 {

	public static void main(String[] args) {
           
		final int x = 100;
		
		final String s8 = "you cannot ";
		s8.concat("Hello");
		
		
		char [] c = {'H','E','L','L','O'};
		
		String c1 = new String(c);
		System.out.println(c1);
		
		byte[] b = {97,98,99,100};
		
		String s1 = new String(b);
		
		System.out.println(s1);
		
		
		String s2 = new String("          Salman  Khan          "  );
		char c2 = 'a';
		System.out.println(s2.trim());
		System.out.println(s2.replace('a','o'));
	//	System.out.println(s2.substring(3,8));
	//	System.out.println(s2.charAt(5));
		
		String s3 = "Sachin";
		String s4 = "sachin";
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
		
		
		
		
		
		
		
	}

}
