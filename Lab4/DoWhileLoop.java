
/*
Barrington Thorpe
Lab 4
*/

import java.util.Random; //to use the random number generator 

public class DoWhileLoop {
    public static void main(String[] args) {
        final int NUMBER = 10000; // the number of times to roll the dice

        // a random number generator used in simulating rolling a dice
        Random generator = new Random();

        int die1Value; // number of spots on the first die
        int die2Value; // number of spots on the second die
        int count = 0; // number of times the dice were rolled
        int snakeEyes = 0; // number of times snake eyes is rolled
        int twos = 0; // number of times double two is rolled
        int threes = 0; // number of times double three is rolled
        int fours = 0; // number of times double four is rolled
        int fives = 0; // number of times double five is rolled
        int sixes = 0; // number of times double six is rolled

        // ENTER YOUR CODE FOR THE ALGORITHM HERE
        do {
            die1Value = generator.nextInt(6) + 1; // returns 1,2,3,4,5,or 6
            die2Value = generator.nextInt(6) + 1; // returns 1,2,3,4,5,or 6

            if (die1Value == die2Value) {
                if (die1Value == 1)
                    snakeEyes++;
                else if (die1Value == 2)
                    twos++;
                else if (die1Value == 3)
                    threes++;
                else if (die1Value == 4)
                    fours++;
                else if (die1Value == 5)
                    fives++;
                else if (die1Value == 6)
                    sixes++;
                // Task #1 step 3: To do - code for die1Value = 3, 4, 5, and 6
            }
            count++;
        } while (count < NUMBER);

        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
        System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
        System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
        System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
        System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
        System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
    }
}