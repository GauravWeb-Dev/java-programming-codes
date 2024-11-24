


public class Launch2 {

	public static void main(String[] args) {
        
		int [][] a = new int[3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	
		 int[][] arr = new int[3][];
			
			arr[0] = new int[2];
			arr[1] = new int[1];
			arr[2] = new int[3];
			
			
			arr[0][0]=10;
			arr[0][1]=20;
			
			arr[1][0]=30;
			
			arr[2][0]=40;
			arr[2][1]=50;
			arr[2][2]=60;
			
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			for(int[] a1 : arr) {
				for(int x : a1) {
					System.out.print(x + " ");
				}
				System.out.println();
			}
			
			
			int[][] x = {{10,20},{30,40},{50,60}};
			
			
	}
	
	  


}
