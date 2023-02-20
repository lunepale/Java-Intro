package section3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //int
        System.out.println("Enter 'a': ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b': ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("Enter 'a': ");

        // double
        double c = new Scanner(System.in).nextDouble();
        System.out.println("Enter 'b': ");
        double d = new Scanner(System.in).nextDouble();
        System.out.println("c + d = "+(c+d));
        System.out.println("c - d = "+(c-d));
        System.out.println("c * d = "+(c*d));
        System.out.println("c / d = "+(c/d));
        System.out.println("c % d = "+(c%d));
    }

}

