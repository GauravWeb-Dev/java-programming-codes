
public class Launch3 {

	public static void main(String[] args) {
		
         Launch3.add(new int[] {10,20,30});
	}
	
	public static void add(int[] a){
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("The sum is ::"+sum);
	}

}
