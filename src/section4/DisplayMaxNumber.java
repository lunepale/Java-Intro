package section4;

import java.util.Scanner;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        //read
        System.out.println("Enter number a");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter number b");
        var b = new Scanner(System.in).nextInt();
        //process
        //String result = a > b ? "Number 1 is greater than 2" : a < b ? "Number 2 is greater than 1" :
        //a == b ? "number 1 equals number 2";

        //display
        System.out.println(
                a > b ? "Number a is greater than b" :
                        b > a ? "Number b is greater than a" :
                                 "number a equals number b");
    }
}
