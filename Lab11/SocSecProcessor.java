
//Barrington Thorpe
//Lab11

import java.util.Scanner;

public class SocSecProcessor {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		String socSecNumber;
		String response;
		char answer = 'Y';

		while (Character.toUpperCase(answer) == 'Y') {
			try {
				System.out.print("Name? ");
				name = keyboard.nextLine();
				System.out.print("SSN? ");
				socSecNumber = keyboard.nextLine();

				if (isValid(socSecNumber)) {
					System.out.println("Name: " + name + " SSN: " + socSecNumber + " is valid");
				}
			} catch (SocSecException e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Continue?  ");
			response = keyboard.nextLine();
			answer = response.charAt(0);
		}
		keyboard.close();
	}

	private static boolean isValid(String number) throws SocSecException {
		boolean goodSoFar = true;
		int index = 0;

		if (number.length() != 11) {
			throw new SocSecException("wrong number of characters ");
		} else if (number.charAt(3) != '-' || number.charAt(6) != '-') {
			throw new SocSecException("dashes at wrong positions");
		} else {
			for (int i = 0; i < number.length(); i++) {
				if (!Character.isDigit(number.charAt(index))) {
					throw new SocSecException("contains a character that is not a digit");
				}
			}
		}
		return goodSoFar;
	}
}