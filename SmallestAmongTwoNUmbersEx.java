package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class SmallestAmongTwoNUmbersEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object
		System.out.println("Enter fisrt value:"); // asking the user to enter the input number1
		System.out.println("Enter second value:"); // asking the user to enter the input number2 
		int a = in.nextInt(); //assigning that input1 to int variable a
		int b = in.nextInt(); //assigning that input12 to int variable b
		if (a < b) { // checking for the condition
			System.out.println(a + " " + "is smaller"); // printing  the result as output 

		} else {
			System.out.println(b + " " + "is smaller"); // printing  the result as output 

		}
	}
}