package section3;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class swapVar {
    public static void main(String[] args) {

        // read data
        System.out.println("Please enter 'a':");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Please enter 'b':");
        var b = new Scanner(System.in).nextInt();
        //process
        var c = b;
        b = a;
        a = c;
        // show results
        System.out.println("It's a: "+a);
        System.out.println("It's b: "+b);
    }
}
