import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
      
		int[] arr = {10,20,30,40,50};
		
		System.out.println(arr.toString());
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = Arrays.copyOf(arr,1);
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		int[] arr3 = {40,20,70,50,10,90};
		
		
		Arrays.sort(arr3);//10,20,40,50,70,90
		
		System.out.println(Arrays.toString(arr3));
	
		System.out.println(Arrays.binarySearch(arr3, 45));

		int[] arr4 =Arrays.copyOfRange(arr3,1,4);
		
		System.out.println(Arrays.toString(arr4));
		
		
		int[] a = {1,2,3,4,5};
		int[] b = {5,4,3,2,1};
		Arrays.sort(b);
		
		System.out.println(Arrays.equals(a, b));
		
		
		
	}

}
