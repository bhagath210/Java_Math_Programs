package com.pioneercoders.mathprograms;

import java.util.Scanner;

public class AreaOfCircleEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // creating object
		System.out.println("Enter the Radius of Cicrle:"); // asking the user for radius
		int radius = in.nextInt(); //assigning that input to radius
		float area = 3.14f * radius * radius; // calculating area
		System.out.println("area ofCicrle is" + " " + area); // printing output
	}
}