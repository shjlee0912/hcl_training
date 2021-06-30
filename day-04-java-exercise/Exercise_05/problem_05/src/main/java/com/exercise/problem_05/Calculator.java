package com.exercise.problem_05;

public class Calculator {
	public Calculator() {

	}

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		return a/b;
	}
	
	public int mod(double a, double b) {
		return (int) a % (int) b;
	}
	
	public double power(double a, double b) {
		return Math.pow(a, b);
	}
	
	public double squareRoot(double a) {
		return Math.sqrt(a);
	}
}
