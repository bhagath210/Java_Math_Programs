package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class ExponentialOfNumberEx {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in); // creating object
	System.out.println("Enter Number:"); // asking the user to enter the number
	int number = in.nextInt(); //assigning that value to number int variable
	System.out.println(Math.exp(number)); // printing  the result as output 
}
}