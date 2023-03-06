package section5;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println("enter your number to display it reverse");
        int number = new Scanner(System.in).nextInt();
        var result=0;
        while (number !=0){
            result=result*10+number%10;
            number = number / 10;
        }


        System.out.println(result);


    }
}
