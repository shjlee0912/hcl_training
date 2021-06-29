package com.example.Exercises;

public class EmplyeeTest {
	
	public static void main(String[] args) {
		
		//New Employee objects
		Employee e1 = new Employee("Sam", "Lee", 5000);
		Employee e2 = new Employee("Jacob", "Chung", 3800);
		
		//Display each Employee's info
		e1.showInfo();
		e2.showInfo();
		
		//Raise each Employee's salary by 10%
		e1.increaseSalaryByPercent(10.0);
		e2.increaseSalaryByPercent(10.0);
		
		//Display each Employee's info after the raise
		e1.showInfo();
		e2.showInfo();
	}
}
