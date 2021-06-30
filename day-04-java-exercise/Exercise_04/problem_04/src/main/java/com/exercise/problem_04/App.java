package com.exercise.problem_04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		System.out.printf("Input a String: ");

		String inputString = readInput.nextLine();
		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char letter = inputString.charAt(i);
			if(isVowel(letter)) {
				count++;
			}
		}
		
		System.out.printf("Number of Vowels in the String: %d\n", count);

	}

	public static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U');
	}
}
