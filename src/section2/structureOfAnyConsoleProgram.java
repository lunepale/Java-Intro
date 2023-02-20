package section2;

import java.util.Scanner;

public class structureOfAnyConsoleProgram {
    public static void main(String[] args) {
        // read source data
        // processing
        // display results
        System.out.println("Please enter the number:");
        var number = new Scanner(System.in).nextInt();
        var result = number +1;
        System.out.println(result);
    }
}
