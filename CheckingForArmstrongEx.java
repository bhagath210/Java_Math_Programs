package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class CheckingForArmstrongEx {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object

		System.out.println("Enter The Number:"); // asking the user for number
		int number = in.nextInt(); //assigning that value to number int variable
		int sum = 0;
		int temp = number; //Assigning number to temp
		while (number != 0) {
			int r = number % 10; // gives remainder
			number = number / 10; // gives coefficient
			sum = sum + (r * r * r); // gives value
		}
		if (sum == temp) { // condition for checking equality
			System.out.println("Number is Armstrong"); // printing output
		} else {
			System.out.println("Number is Not Armstrong"); // printing output
		}
	}
}