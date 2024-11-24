
public class TestApp2 {

	public static void main(String[] args) {
       String s1 = new String ("Sachin");
       String s2 = new String("Sachin");
       
       System.out.println(s1==s2);
       System.out.println(s1.equals(s2));
       
       StringBuilder sb1 = new StringBuilder("sachin");
       StringBuilder sb2 = new StringBuilder("sachin");
       System.out.println(sb1==sb2); //false
       System.out.println(sb1.equals(s2));//false
		
	}

}
