package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class SumOfIndividualDigitsEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object
		System.out.println("Enter the Number:"); // asking the user for input number 
		int number = in.nextInt(); //assigning that input to int variable
		int sum = 0;
		while (number != 0) { 
			int r = number % 10;
			number = number / 10;
			sum = sum + r;
		}
		System.out.println("Sum of Individual Digits is equal to" + " " + sum); // printing output
	}
}