
class Student{
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Student[id = " + id + ", Name= " + name + " ]";
	}
	
	public static Student method(String name ,int id) {
		Student s1 = new Student();
		s1.setName(name);
		s1.setId(id);
		
		return s1;
	}
}

public class Test2 {

	public static void main(String[] args) {
        
		//System.out.println(Student.method("Dhoni", 7));
		
		
		Student s1 = new Student();
		System.out.println(s1);
		
	}

}
