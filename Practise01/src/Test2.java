class Mobile {
	// has part = variables
	String name = "s23";
	int imei = 123456789;
	String color = "Black";

	// does part = methods
	/*
	 * 1.Access Modifier 2.Return Type 3.name 4.Input/parameter 5.Body
	 */
	public void call() {
		System.out.println("Calling a friend");
	}

	public String msg(String s) {

		return s;
	}

	public int methodOne() {
		return 100;
	}

}

class Test2 {
	public static void main(String[] args) {

		Mobile m = new Mobile();

		System.out.println(m.msg("Good Afternoon"));
		System.out.println(m.name);

		Mobile m2 = new Mobile();

	}
}
