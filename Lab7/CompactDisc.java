//Barrington Thorpe
//Lab7

/**This program creates a list of songs for a CD by reading from a file*/
import java.io.*;

public class CompactDisc {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("Classics.txt");
		BufferedReader input = new BufferedReader(file);
		String title;
		String artist;

		// Declare an array of songs of size 6
		Song[] cd = new Song[6];

		for (int i = 0; i < cd.length; i++) {
			title = input.readLine();
			artist = input.readLine();
			// Task #2 step 2 - creating a new song with
			// the title and artist, and store it into the array, like
			cd[i] = new Song(title, artist);
		}

		// close the input file
		input.close();

		// create an object of type FileWriter using "Results.txt"
		FileWriter fwriter = new FileWriter("Results.txt");
		// create an object of PrintWriter passing it the FileWriter object.
		PrintWriter output = new PrintWriter(fwriter);

		System.out.println("Contents of Classics:");
		for (int i = 0; i < cd.length; i++) {
			// Task #2 step 3 - print the contents of the array to the console
			// using cd[i].toString() to get the contents string
			// print the results to the output file
			output.println(cd[i].toString());
		}

		// close the output file
		output.close();
	}
}