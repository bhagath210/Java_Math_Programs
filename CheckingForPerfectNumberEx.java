package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class CheckingForPerfectNumberEx {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object

		System.out.println("Enter the Number that you have to Check:"); // asking the user for number
		int number = in.nextInt(); //assigning that value to number int variable
		int i = 1, sum = 0; // initializing the variables
		while (i < number) {
			if (number % i == 0) //condition
				sum = sum + i; // statement
				i++; // increment i value
		}
		if (sum == number) { // condition for checking equality
			System.out.println("Number is Perfect Number"); // printing output
		} else {
			System.out.println("Number is Not Perfect Number"); // printing output
		}
	}
}