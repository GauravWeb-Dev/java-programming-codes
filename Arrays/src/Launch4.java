import java.util.Arrays;

public class Launch4 {

	public static void main(String[] args) {
		
		
		
		int[] x = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(x));
		
		
		  int[] arr = { 10, 20, 30, 40, 50 };
		  int[] duplicateArray = Arrays.copyOf(arr, 3);
		  System.out.println(Arrays.toString(duplicateArray));
		  
		  
		  int[] arr1 = { 50, 40, 30, 20, 10 };
		  Arrays.sort(arr1);
		  
		  System.out.println(Arrays.toString(arr1));
		  
		  System.out.println(Arrays.binarySearch(arr1, 45));
		  
		  
		  int[] arr3 = { 50, 40, 30, 20, 10 };
	      Arrays.sort(arr3);
	      int[] arr2 = { 10, 20, 30, 40, 50 };
	      System.out.println(Arrays.equals(arr3, arr2));
	}
	
	

}
