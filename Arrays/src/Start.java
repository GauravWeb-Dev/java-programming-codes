
public class Start {

	public static void main(String[] args) {
        
		int[] a = new int[5];
		
		System.out.println(a);
		System.out.println(a[2]);
		
		String [] name = new String[2];
		
		System.out.println(name[1]);
		
		char[] c = new char[3];
		System.out.println(c[2]);
		
		float f [] = new float[4];
		System.out.println(f[2]);
		
		int[] arr = new int[6];
		
		byte b = 127;
		arr[0] = b;
		
		short s = 4567;
		arr[1] = s;
		
		char c1 = 'A';
		
		arr[2] = c1;
		
		long l = 100l;
		
		arr[3] =(int) l;
		
		for(int x : arr) {
			System.out.println(x);
		}
		
		
		
	}

}
