package com.solution.main;
class Mobile{
	private int ram;
	private int storage;
	
	Mobile(int ram,int storage){
		this.ram=ram;
		this.storage=storage;
	}
	
	public int getRam() {
		return ram;
	}
	public int getStorage() {
		return storage;
	}
	

}
public class Start {

	public static void main(String[] args) {
  
		Mobile m1 = new Mobile(8,256);
		
	}

}
