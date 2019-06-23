package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class CheckingForPalindromeEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object
		System.out.println("Enter The Number:"); // asking the user for number to be check
		int number = in.nextInt(); //assigning that input to int variable
		int temp = number, sum = 0; //Assigning number to temp
		while (number != 0) {
			int r = number % 10; // gives remainder
			number = number / 10; // gives coefficient
			sum = sum * 10 + r; // gives value
		}
		if (sum == temp) { // condition for checking equality
			System.out.println("Number is Armstrong"); // printing output
		} else {
			System.out.println("Number is not Armstrong"); // printing output
		}
	}
}