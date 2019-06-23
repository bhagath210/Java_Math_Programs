package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class CheckingForPositiveOrNegativeEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object
		System.out.println("Enter the Number:"); // asking the user to enter the number
		int number = in.nextInt(); //assigning that value to number int variable
		if (number == 0) { // checking condition 1
			System.out.println("The Entered number is Zero");
		} else if (number < 0) { // checking condition 2
			System.out.println("The Entered number is Negative"); // printing output
		} else {
			System.out.println("The Entered number is Positive"); // printing output
		}
	}
}