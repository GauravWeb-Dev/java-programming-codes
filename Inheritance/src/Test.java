class Parent {
	int money = 1000;
	int age = 45;
	String surname = "Reddy";

	public void married() {
		System.out.println("you are going to marry xyz");
	}
}

class Child extends Parent {
    
	public void play() {
		System.out.println("Playing");
	}
}

public class Test {

	public static void main(String[] args) {

		Parent p1 = new Parent(); // tightly coupled
		p1.age = 55;
		p1.money = 99999999;
		p1.surname = "Ambani";
		
		
		System.out.println(p1.age +" "+ p1.surname +" "+ p1.money);
		p1.married();

		Child c1 = new Child(); // tightly coupled
		System.out.println(c1.money);
		System.out.println(c1.surname);
		c1.married();
		c1.play();

		Parent c2 = new Child(); //loosely coupled
		System.out.println(c2.money);
		System.out.println(c2.surname);
		c2.married();
	//	c2.play();
		

	}

}
