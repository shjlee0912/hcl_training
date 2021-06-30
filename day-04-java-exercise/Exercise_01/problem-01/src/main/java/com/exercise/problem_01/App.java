package com.exercise.problem_01;

import java.util.Scanner;

/**
 * program to read a string and to test whether first and last character are
 * same.
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);

		System.out.printf("Input String: ");
		String inputString = readInput.nextLine();

		//quit to end program
		while (!inputString.equals("quit")) {
			int lastIndex = inputString.length() - 1;
			if (inputString.charAt(0) == inputString.charAt(lastIndex)) {
				System.out.printf("Valid\n");
			} else {
				System.out.printf("Invalid\n");
			}

			System.out.printf("Input String: ");
			inputString = readInput.nextLine();
		}
		System.out.printf("End of Program\n");
	}
}
