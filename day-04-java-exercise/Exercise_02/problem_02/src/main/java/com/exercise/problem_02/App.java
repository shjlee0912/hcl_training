package com.exercise.problem_02;

public class App {
	public static void main(String[] args) {
		String str1;
		String str2;

		str1 = "cat";
		str2 = "cat";
		String str3 = new String("cat");
		StringBuilder str4 = new StringBuilder("cat");

		if (str1 == str2) {
			System.out.println("str1 == str2");
		} else {
			System.out.println("str != str2");
		}

		if (str3 == str2) {
			System.out.println("str3 == str2");
		} else {
			System.out.println("str3 != str2");
		}
		
		System.out.println(str4.append(" runs"));
	}
}
