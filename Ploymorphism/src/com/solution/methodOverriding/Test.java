package com.solution.methodOverriding;
class Student{
	private int id;
	private String name;
	private int age;
	private char gender;
	
	Student(int id ,String name ,int age, char gender){
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "Student[ Id="+id+", Name="+name+", Age="+age+", Gender="+gender+"]";
	}
	
}

public class Test {

	public static void main(String[] args) {
         
		Student s = new Student(1,"Salman Khan",56,'M');
		
		System.out.println(s);
	}

}
