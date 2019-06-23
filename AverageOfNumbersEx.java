package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class AverageOfNumbersEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object
		System.out.println("Enter the first number:"); //Asking the user to enter 1st number
		System.out.println("Enter the second number:"); //Asking the user to enter 2nd number
		System.out.println("Enter the third number:"); //Asking the user to enter 3rd number
		int a = in.nextInt(); // Assigning 1st number to a
		int b = in.nextInt(); // Assigning 2nd number to b
		int c = in.nextInt(); // Assigning 3rd number to c
		float average = ((a + b + c) / 3); // calculating average
		System.out.println("Average of Numbers is:" + average); //Printing output
	}
}