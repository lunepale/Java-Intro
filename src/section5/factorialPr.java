package section5;

import java.util.Scanner;

public class factorialPr {
    public static void main(String[] args) {
        System.out.println("enter your number to calculate factorial");
        int number = new Scanner(System.in).nextInt();
        int factorial = number;
        var maxValue = Integer.MAX_VALUE;
        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
             }
        System.out.println(factorial);
               if (number == 0) {
            System.out.println("Value should be more than 0");
        } if (factorial >= maxValue ) {
            System.out.println("int overflow");
        }

    }

}