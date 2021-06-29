package com.example.Exercises;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class Dog {
	
	private String name;
	private int age;
	private double weight;
	
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public void showExcitement() {
		System.out.println(name + " is wagging its tail!!");
	}
	
	//overloading showExcitement
	public void showExcitement(int levelOfExcitement) {
		System.out.println(name + " is wagging its tail!! Excitement level: " + levelOfExcitement);
	}
	
	public void eating() {
		System.out.println("eating!");
	}
	
	//overloading eating
	public void eating(String food) {
		System.out.println("eating " + food + "!");
	}
}
