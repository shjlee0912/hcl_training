package com.example;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello!!");

		boolean result;
		result = 8 > 11;

		//if-else statement
		if (result) {
			System.out.println("result: " + result);
		} else {
			System.out.println("end");
		}
		System.out.println("end if-else\n");

		int num = 5;

		//switch statement
		switch (num) {
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			System.out.println("default value");
		}

		System.out.println("end of switch\n");

		int count = 0;
		int tracking = 0;
		
		//while loop
		while (count < 10) {
			System.out.println("count: " + count);
			count++;
			tracking = count;
		}
		System.out.println("end while loop\n");
		System.out.println("total count: " + count);
		System.out.println("total tracking: " + tracking + "\n");
		
		
		count = 0;
		tracking = 0;
		//do-while loop
		do {
			count++;
			System.out.println("do-while count: " + count);
		} while (count < 5);
		
		//for-loop
		System.out.println("\nFor-loop");
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		int [] intArray = new int[10];
		intArray[0] = 7;
		intArray[7] = 3;
		
		int[] secondIntArray = {9,18,25,2,8};
		
		//for-each
		for(int e : secondIntArray) {
			System.out.println("e= "+e);
		}
	}

}
