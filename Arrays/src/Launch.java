
public class Launch {

	public static void main(String[] args) {
          
		int[] arr =new int[5];
		
		System.out.println(arr);
		
		float [] f = new float[8];
		
		System.out.println(f);
		
		int[] arr2 =new int[5];
		
		arr2[0]=100;
		arr2[1]=110;
		
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println();
		
		
		for(int i=arr2.length-1;i>=0;i--) {
			arr2[i] += 100;
			System.out.println(arr2[i]);
		}
//		char [] s1 = new char[5];
//		
//		for(int i=0;i<s1.length;i++) {
//			System.out.println(s1[i]);
//		}
//		
		
		
		
		String[] names = new String[5];
		names[0]="shravni";
		names[1]="prajacta";
		names[2]="Anjali";
		names[3]="Satyajit";
		names[4]="Apurva";
		
		for(String s : names) {
			System.out.println(s);
		}
		
		
		int[] x = {1,2,3,4,5,6,7,8,9};
		
		String[] s = {"A","B","C","D"};
		
		  int[] a=new int[2147483647];
		
	//	int[] a =new int[-5];
		
		
	}

}
