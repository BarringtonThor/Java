
//Barrington Thorpe
//Lab9
import java.util.Scanner;

public class TimeDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char answer = 'Y';
		String enteredTime;
		String response;

		while (answer == 'Y') {
			System.out.print("Enter a military time using the ##:## form   ");
			enteredTime = keyboard.nextLine();
			Time now = new Time(enteredTime);
			System.out.println("Do you want to enter another (Y/N)?  ");
			response = keyboard.nextLine();
			response = response.toUpperCase();
			answer = response.charAt(0);
		}
		keyboard.close();

	}
}