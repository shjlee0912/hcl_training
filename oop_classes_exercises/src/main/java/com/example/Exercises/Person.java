package com.example.Exercises;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	private String name;
	private int age;
	private double showSize;
	
	private void walking() {
		System.out.println(this.toString());
	}
	
	public void startWalking() {
		this.walking();
	}
		
}
