import java.util.Arrays;

class Student{
	int id;
	String name;
	
}
public class Launch1 {

	public static void main(String[] args) {
        
		Student s1 = new Student();
		Student s2 = new Student();
		
		Student[] info = new Student[3];
		info[0] =s1;
		info[1] = s2;
		
		for(Student s :info) {
			System.out.println(s);
		}
		
		Number[] num = new Number[2];
		
		Integer a = 100;
		
		num[0] = a;
		
		int[] x1 = new int[4];
		Object[] o = new Object[3];
		o[0] = s1;
		o[1]= x1;
		
		System.out.println(Arrays.toString(o));
	}

}
