class School{
	int playGround = 2;
	int classRoom = 5;
	
}

class Student extends School{
	int playGround = 9;
	
	public void play() {
		System.out.println(super.playGround);
	}
}

public class Test6 {

	public static void main(String[] args) {
       
		Student s1 = new Student();
		s1.play();
	}

}
