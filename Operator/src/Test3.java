
public class Test3 {

	public static void main(String[] args) {
           
		int x = 10;//12
		int y = 11;//12
		
		boolean b = (++x == y) | (y++ == x++);
	              // 11 == 11  && 10 == 11
		System.out.println(b);
		System.out.println("X :: "+x);
		System.out.println("Y :: "+y);
	
	}

}
