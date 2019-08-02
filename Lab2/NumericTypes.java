
//Barrington Thorpe
//Lab 2

import java.util.Scanner;

public class NumericTypes {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// identifier declarations
		final double NUMBER = 2; // number of scores
		final int SCORE1 = 100; // first test score
		final int SCORE2 = 95; // second test score
		final int BOILING_IN_F = 212; // freezing temperature
		int fToC; // temperature in celsius
		double average; // arithmetic average
		String output; // line of output to print out
		// TASK #2 declare variables used here
		String firstName;
		String lastName;
		String fullName;
		char firstInitial;

		// Find an arithmetic average
		average = (SCORE1 + SCORE2) / NUMBER;
		// Task #1 help: add (score1 + score2) to get addition before division
		output = SCORE1 + " and " + SCORE2 + " have an average of " + average;
		System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
		fToC = 5 / 9 * (BOILING_IN_F - 32);
		// Task #1 help: Use cast to change data type
		fToC = (int) (5 / (double) 9 * (BOILING_IN_F - 32));
		// Note: 5/9 is integer division and result is 0
		// 5/(double)9 is double division and result is 0.5555;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println(); // to leave a blank line

		// ADD LINES FOR TASK #2 HERE
		// prompt the user for first name
		// read the user's first name
		System.out.print("Enter your first name: "); // help : uncomment the line
		// below by deleting the leading
		firstName = keyboard.nextLine(); // help : uncomment the line below by
		// deleting the leading
		// To do - prompt the user for last name - follow the style of firstName
		System.out.print("Enter your last name: ");
		// To do - read the user's last name follow the style of firstName
		lastName = keyboard.nextLine();
		// concatenate the user's first and last names
		fullName = firstName + " " + lastName; // help : uncomment the line below by
		// deleting the leading //
		// print out the user's full name
		System.out.println(fullName + " has " + fullName.length() + " characters");
		// // help : uncomment the line below by deleting the leading //

		System.out.println(); // to leave a blank line

		// ADD LINES FOR TASK #3 HERE
		// get the first character from the user's first name
		firstInitial = firstName.charAt(0); // help : uncomment the line below by
		// deleting the leading //
		// To do - print out the user's first initial
		System.out.println(firstInitial);
		// To do - convert the user's full name to all capital letters
		// help - use fullName = fullName.toUpperCase();
		fullName = fullName.toUpperCase();
		// To do - print out the user's full name in all capital letters
		System.out.println(fullName);

		System.out.println(); // to leave a blank line
		keyboard.close();
	}
}