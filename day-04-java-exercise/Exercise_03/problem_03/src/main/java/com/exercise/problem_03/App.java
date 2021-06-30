package com.exercise.problem_03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);

		System.out.printf("Input a String: ");
		String inputString = readInput.nextLine();

		while (!inputString.equals("quit")) {
			int length = inputString.length();

			if (length % 2 == 0) {
				// if length of the string is even
				int middle = length / 2;
				System.out.printf("The middle characters in the string: %c, %c\n", inputString.charAt(middle - 1),
						inputString.charAt(middle));
			} else {
				// if length of the string is odd
				int middle = length / 2;
				System.out.printf("The middle character in the string: %c\n", inputString.charAt(middle));
			}

			System.out.printf("Input a String: ");
			inputString = readInput.nextLine();
		}
		// End of program
		System.out.printf("End of Program\n");
	}
}
