class Student{
	//has part
	//instance variable
	 int id;
	 String name;
	 int age;
	 
	 
	 //does part
	 public void play() {
		 System.out.println("playing cricket");
	 }
	 
	 public void study() {
		 System.out.println("Learning java");
	 }
}
class Mobile{
	
}

 class Start {
    int t =100;
    
	 
	public static void main(String[] args) {
		
		  Mobile mob1 = new Mobile();
           Start s = new Start(); 
		int x = 100;
		
		Student s1 = new Student();
		System.out.println(s1);
		s1.id = 1;
		s1.name = "Sharadhha";
		s1.age = 23;
		System.out.println(s1.id + " " +s1.name+ " "+ s1.age);
		s1.play();
	
		
		System.out.println();
		
		Student s2 = new Student();
		System.out.println(s2);
		s2.id = 2;
		s2.name = "Rohan";
		s2.age = 12;
		System.out.println(s2.id + " " +s2.name+ " "+ s2.age);
		s2.study();
		
		
		int x1;
		//System.out.println(x1);
	}

}