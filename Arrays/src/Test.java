
public class Test {

	public static void main(String[] args) {
          
		int[] arr1 = {1,2,3,4,5,6,7,8,9};		
		int[] arr = new int[5];
		
		arr[0] = 100;
		arr[1] = 101;
		arr[2] = 102;
		arr[3] = 103;
		arr[4] = 104;
		
		System.out.println(arr);
		
		
		//1 type = for loop
		for(int i=0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		
		//2 type = for-each loop
		for(int x : arr) {
			System.out.println(x);
		}
		
		
		
		System.out.println();
		
		String  arr2[] = new String[2];
		
		arr2[0]="Hello";
		
		arr2[1] = "EveryOne";
		
	   for(String s : arr2) {
		   System.out.println(s);
	   }
	   
	   int[] a =new int[0];
       System.out.println(a.length);
       
       
       char c='a';
       int[] a1=new int[c];//valid

      System.out.println(a1.length);
		
	}

}