class Student{
    int id  = 100;
	String name;
	int age;
	
	
	public void study() {
		System.out.println("Students are studying");
	}
	
	public void play() {
		System.out.println("Students are playing");
	}
	
	
}




public class Test3 {
    public static void main(String[] args) {
    	
    	
    	 Student s1 = new Student();
    	
    	 s1.name="Sachin";
    	 s1.age = 23;
    	 
    	 System.out.println(s1.id);
    	
    	 Student s2 = new Student();
    	 s2.id=2;
    	 s2.name="dhoni";
    	 s2.age=24;
    	 System.out.println(s2.id);
    	 
    	 System.out.println(s1);
    	 System.out.println(s2);
    }
}
