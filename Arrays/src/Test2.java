
public class Test2 {

	public static void main(String[] args) {
         
		Object[] x = new Object[9];
		
		int a  = 100; //primitive
		
		Integer a2 = 100;//Wrapper class
		
		String name = "Aniket";
		
		x[0] =a;
		x[1] = a2;
		x[3] = name;
		
		for(Object o : x) {
			System.out.println(o);
		}
		
		Number[] n = new Number[3];
		
		int v = 99;
		n[1] = v;
		
		Boolean b = true;
		
		String s = "good";
		n[2] = 1;
		
		byte[] b1 = {1,2,3,4,5,6};
		
		//int[] x2 = b1;
		int[] x2 = new int[b1.length];
		
		for(int i=0;i<b1.length;i++) {
			x2[i] = b1[i];
		}
		
		for(int a1 :x2) {
			System.out.println(a1);
		}
		
		String[] arr2 = {"1","2"};
		
		Object[] h = arr2;
		
		
		 int[] a5= {10,20,30,40};
		 System.out.println(a5);
	     int[] b5= {100,200};
	     System.out.println(b5);
	     a5=b5;
	     
	     System.out.println(a5);
	     b5=a5;
	     
	     
	
	     
	     
	}

}
