package section5;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        int number=new Random().nextInt(10);

        System.out.println("enter your guess from 0 to 9");

        while(true){
            int guess1=new Scanner(System.in).nextInt();
             if (number > guess1) {
                            System.out.println(" guessed number is less than comp number");
                } else if (number < guess1) {
                            System.out.println("guessed number is bigger then comp number");
                }        else{
            System.out.println("you guessed right");
            break;


             }
        }
    }
}

