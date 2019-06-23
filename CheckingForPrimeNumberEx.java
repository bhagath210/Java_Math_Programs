package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class CheckingForPrimeNumberEx {
	public static void main(String[] args) {
		@SuppressWarnings("resource") 
		Scanner in = new Scanner(System.in); // creating object

		System.out.println("Enter the Number:"); // asking the user to enter the number
		int number = in.nextInt(); //assigning that value to number int variable
		int count = 0; // initializing the count variable
		for (int i = 2; i < (number / 2); i++) { // for loop for iteration
			if (number % i == 0) { // condition
				count++; // increment the count value
				break; 
			}
		}
		if (count == 0 && number != 1) { // checking for the condition
			System.out.println("Number is Not Prime"); // printing output
		} else {
			System.out.println("Number is Prime"); // printing output
		}
	}
}