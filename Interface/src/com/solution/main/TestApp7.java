package com.solution.main;

interface ISchool {
	public void play();

	public void study();

	public void run();

	public void eat();

	public void learn();

	public void practicals();

}

class SchoolImpl implements ISchool {

	@Override
	public void play() {

	}

	@Override
	public void study() {

	}

	@Override
	public void run() {

	}

	@Override
	public void eat() {

	}

	@Override
	public void learn() {

	}

	@Override
	public void practicals() {

	}

}

class Student extends SchoolImpl{
	@Override
	public void play() {
		System.out.println("Playing cricket");
	}
	
	@Override
	public void eat() {
		System.out.println("eatting tiffins");
	}
}

public class TestApp7 {

	public static void main(String[] args) {
         
	}

}
