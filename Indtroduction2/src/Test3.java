
public class Test3 {

	public static void main(String[] args) {
         
		int x = 10;
		
		if((++x < x) & (x++ >10)) {
			System.out.println(x);
		}
		
		System.out.println(x);
		
		
		
		int y= 12;//12
		
		if((y++ > 10) | (y-- < 13)) {
		  //12>10
			System.out.println(y);
		}
		
		System.out.println(y);
	}
	

}
