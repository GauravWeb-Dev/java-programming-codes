
public class Test3 {

	public static void main(String[] args) {
        int[][] arr = new int[3][2];
        
        arr[0][0] = 10;
        arr[0][1] = 20;
        
        arr[1][0] = 30;
        arr[1][1] = 40;

        arr[2][0] = 50;
        arr[2][1] = 60;
        
        //for loop
        for(int i=0;i<arr.length;i++) {
        	
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+ " ");
        	}
        	System.out.println();	
        }
        
        System.out.println();
        
        
        for(int[] x : arr) {
        	for(int d : x) {
        		System.out.print(d +" ");
        	}
        	System.out.println();
        }
        
     int[][] arr2 = new int[3][];
        
     arr2[0] = new int[3];
     arr2[1] = new int[1];
     arr2[2] = new int[2];
     
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;

        arr2[1][0] = 40;
       
        arr2[2][0] = 50;
        arr2[2][1] = 60;
        
        System.out.println();
        
        
        for(int i=0; i<arr2.length;i++) {
        	for(int j=0;j<arr2[i].length;j++) {
        		System.out.print(arr2[i][j] + " ");
        	}
        	System.out.println();
        }
        
        System.out.println();
        
        for(int [] x1 : arr2) {
        	for(int y : x1) {
        		System.out.print(y + " ");
        	}
        	System.out.println();
        	
        }
        
        
        
        
        

        
	}

}
