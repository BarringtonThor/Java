
//Barrington Thorpe
//Lab7

import java.util.Scanner;

public class Average {
	private int[] data;
	private double mean;

	public Average() // this is the constructor
	{
		data = new int[5];
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < data.length; i++) {
			System.out.print("Enter score number " + (i + 1) + ":  ");
			data[i] = keyboard.nextInt();
		}

		// Task #1 step 2: To do - call method selectionSort and calculateMean here
		calculateMean();
		selectionSort();
		keyboard.close();
	}

	public void selectionSort() {
		int maxIndex;
		int maxValue;
		// uncomment following code. Read text book 7.11 to understand the selectionSort
		// algorithm and the code
		for (int startScan = 0; startScan < data.length - 1; startScan++) {
			maxIndex = startScan;
			maxValue = data[startScan];
			for (int index = startScan + 1; index < data.length; index++) {
				if (data[index] > maxValue) {
					maxValue = data[index];
					maxIndex = index;
				}
			}
			data[maxIndex] = data[startScan];
			data[startScan] = maxValue;
		}
	}

	public void calculateMean() {
		// Task #1 step 3: To do - Calculate Mean of the data
		// using defined class fields data and mean
		int i, s = 0;
		for (i = 0; i < data.length; i++) {
			s = s + data[i];
		}
		mean = (double) s / (data.length);
	}

	public String toString() {
		String output;
		output = "The test scores in descending order are \n";

		for (int i = 0; i < data.length; i++) {
			output = output + data[i] + "     ";
		}
		output = output + "\nThe average is " + mean;
		return output;
	}
}