class Laptop{
	//has-part  variables
	int ram = 8;
	String name = "Lenovo";
	String model = "Thinkpad";
	
	//does-part methods
	public void work() {
		System.out.println("Working");
	}
	
	public String songs() {
		String s = "Songs playing";
		return s;
	}
	
	public void browser(int x , String s) {
		System.out.println(x + s);
	}
	
	
}


public class Launch {

	public static void main(String[] args) {
	
         Laptop l1 = new Laptop();
         
         l1.work();
         
        String s1 = l1.songs();
        System.out.println(s1);
        
        l1.browser(10,"google");
         
	}

}
