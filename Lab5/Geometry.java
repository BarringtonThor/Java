
//Barrington Thorpe
// Lab 5

import java.util.Scanner;

public class Geometry {

	/**
	 * The printMenu method prints the menu for the user to choose from
	 */
	public static void printMenu() {
		System.out.println("This is a geometry calculator");
		System.out.println("Choose what you would like to calculate");
		System.out.println("1.  Find the area of a circle");
		System.out.println("2.  Find the area of a rectangle");
		System.out.println("3.  Find the area of a triangle");
		System.out.println("4.  Find the circumference of a circle");
		System.out.println("5.  Find the perimeter of a rectangle");
		System.out.println("6.  Find the perimeter of a triangle");
		System.out.print("Enter the number of your choice: ");
		// To do - Add more menu items mentioned on Task #1
	}

	/**
	 * The circleArea method returns the area of the circle
	 * 
	 * @param radius The radius of the circle
	 * @return The area of the circle
	 */
	public static double circleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static double rectangleArea(double length, double width) {
		return length * width;
	}

	public static double triangleArea(double base, double height) {
		return ((1.0 / 2.0) * base * height);
	}

	public static double circumference(double radius) {
		return 2.0 * Math.PI * radius;
	}

	public static double rectanglePerimeter(double length, double width) {
		return (2.0 * length) + (2.0 * width);
	}

	public static double trianglePerimeter(double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}

	// To do - Add more method follow the style of circleArea for Task #2

	public static void main(String[] args) {
		int choice; // the user's choice
		double value = 0.0; // the value returned from the method
		char letter; // the Y or N from the user's decision to exit
		double radius; // the radius of the circle
		double length; // the length of the rectangle
		double width; // the width of the rectangle
		double height; // the height of the triangle
		double base; // the base of the triangle
		double side1; // the first side of the triangle
		double side2; // the second side of the triangle
		double side3; // the third side of the triangle

		// create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// do loop was chose to allow the menu to be displayed first
		do {
			printMenu();
			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the radius of the circle:  ");
				radius = keyboard.nextDouble();
				value = circleArea(radius);
				System.out.println("The area of the circle is " + value);
				break;
			case 2:
				System.out.print("Enter the length of the rectangle:  ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of the rectangle:  ");
				width = keyboard.nextDouble();
				value = rectangleArea(length, width);
				// To do for Task #3 - call the rectangleArea method and store the result in the
				// value variable
				// follow the style in case 1
				System.out.println("The area of the rectangle is " + value);
				break;
			case 3:
				System.out.print("Enter the height of the triangle:  ");
				height = keyboard.nextDouble();
				System.out.print("Enter the base of the triangle:  ");
				base = keyboard.nextDouble();
				value = triangleArea(base, height);
				// To do for Task #3 - call the triangleArea method and store the result in the
				// value variable
				// follow the style in case 1
				System.out.println("The area of the triangle is " + value);
				break;
			case 4:
				System.out.print("Enter the radius of the circle:  ");
				radius = keyboard.nextDouble();
				value = circumference(radius);
				// To do for Task #3 - call the circumference method and store the result in the
				// value variable
				// follow the style in case 1
				System.out.println("The circumference of the circle is " + value);
				break;
			case 5:
				System.out.print("Enter the length of the rectangle:  ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of the rectangle:  ");
				width = keyboard.nextDouble();
				value = rectanglePerimeter(length, width);
				// To do for Task #3 - call the perimeter method and store the result in the
				// value variable
				// follow the style in case 1
				System.out.println("The perimeter of the rectangle is " + value);
				break;
			case 6:
				System.out.print("Enter the length of side 1 of the triangle:  ");
				side1 = keyboard.nextDouble();
				System.out.print("Enter the length of side 2 of the triangle:  ");
				side2 = keyboard.nextDouble();
				System.out.print("Enter the length of side 3 of the triangle:  ");
				side3 = keyboard.nextDouble();
				value = trianglePerimeter(side1, side2, side3);
				// To do for Task #3 - call the perimeter method and store the result in the
				// value variable
				// follow the style in case 1
				System.out.println("The perimeter of the triangle is " + value);
				break;
			default:
				System.out.println("You did not enter a valid choice.");
			}
			keyboard.nextLine(); // consumes the new line character after the number
			System.out.println("Do you want to exit the program (Y/N)?:  ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);
		} while (letter != 'Y' && letter != 'y');
		keyboard.close();
	}
} // End of the class