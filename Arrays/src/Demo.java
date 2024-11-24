
public class Demo {

	public static void main(String[] args) {
       
		
		String name[] = {"salman","akshay","virat","katrina","shradhha","Priyanka" };
		
		for(String s : name) {
			System.out.println(s);
		}
		
		System.out.println();
		for(int i =0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		int x[] = {10,20,30,40,50,60,70};
		
		for(int i =0;i<x.length;i++) {
			x[i] += 1;
			
		}
		for(int a : x) {
			System.out.println(a);
		}
		
		
		int num[] = {1,2,3,4,5,6,7,8,9,10};
 		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2==1) {
				System.out.println(num[i]);
			}
		}
		
		
		char a = 'A';
		int [] arr = new int[a];
		
		System.out.println(arr.length);
		
		boolean[]  b = {true,false,true};
		
		
		
		
		
		
		
	

		
	}

}
