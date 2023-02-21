package section4;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        System.out.println("Please enter a:");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Please enter b:");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Enter operator(+,-,*,/,%)");
        var operator = new Scanner(System.in).nextLine().charAt(0);
         String result;
             if (operator == '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a-b= " + (a - b);
        } else if (operator == '*') {
            result = "a*b= " + (a * b);
        } else if (operator == '/') {
            result = "a/b= " + (a / b);
        } else if (operator == '%') {
            result = "a%b= " + (a % b);
        } else {
            result = "Unsupported operator: " + operator;
        }
        System.out.println(result);
    }
}
