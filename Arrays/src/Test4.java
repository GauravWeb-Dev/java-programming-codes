import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
      
		Test4 t = new Test4();
		
		t.add(new int[] {10,20,30});
		t.add(new int[] {2,2,2,2,2});
		
		
		
	
		
		System.out.println("end of main method");
		
	}
	
	public void add(int[] a) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}

}
