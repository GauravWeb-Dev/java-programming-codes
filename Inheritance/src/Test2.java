class Animal{
	int noOfLegs;
	String name;
	String voice;
	String color;
	int teeth;

	public void bite() {

	}

	public void run() {

	}
}

class Dog extends Animal {

}

class Cat extends Animal{
	
}

public class Test2 {

	public static void main(String[] args) {
        Dog d1 = new Dog();
        
        d1.name="tommy";
        d1.color = "White";
        d1.noOfLegs = 4;
        d1.teeth = 42;
        
        d1.bite();
        d1.run();
        
        
        
        
        
	}

}
