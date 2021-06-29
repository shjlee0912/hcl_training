package com.example.Exercises;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Dog1", 5, 50);
		Dog d2 = new Dog("Dog2", 4, 40);
		
		System.out.println(d1);
		System.out.println(d2);
		
		d1.showExcitement();
		d2.showExcitement(100);
		
		d1.eating();
		d2.eating("food");
	}

}
