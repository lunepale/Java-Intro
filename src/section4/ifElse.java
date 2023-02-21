package section4;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();
        if (a > b) {
            var result = "a > b";
            System.out.println(result);
        }

        if (a>b) {
            System.out.println("a>b");
        }else {
            if (a<b) {
                System.out.println("a<b");
            } else {

                        System.out.println("a=b");}
            }
        //
        boolean condition = a>b;
        if (condition){
            System.out.println("condition=true");
        }
        }
    }

