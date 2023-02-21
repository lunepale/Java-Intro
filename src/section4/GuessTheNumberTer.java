package section4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberTer {
    public static void main(String[] args) {
        // read data
        var number = new Random().nextInt(10); //randomizer
        System.out.println("Please guess a number from 0 to 9");
        var   guess = new Scanner(System.in).nextInt();

        /*/ process
        String result;
        if (number == guess) {
            result = "Congrats";
        } else {
            result = "Try again. The random number was  " + number;
        }
        display*/
        String result=number == guess ? "Congrats" : "Try again, the number was "+ number;
        System.out.println (result);
    }
}
