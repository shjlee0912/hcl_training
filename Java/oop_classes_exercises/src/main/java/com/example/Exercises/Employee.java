package com.example.Exercises;

public class Employee {
	
	//first name
	private String firstName;
	//last name
	private String lastName;
	//monthly salary
	private double salary;
	
	//constructor
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (salary > 0) {
			this.salary = salary;
		} else {
			this.salary = 0.0;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		}
	}
	
	public void showInfo() {
		System.out.println("Name: " + firstName + " " + lastName + ", Monthly Salary: $" + salary);
	}
	
	public void increaseSalaryByPercent(double percentage) {
		double increaseAmount = salary * (percentage / 100.0);
		this.salary += increaseAmount;
	}
	
	
}
