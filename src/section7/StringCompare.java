package section7;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {


        String s1=new Scanner(System.in).nextLine();
        String s2=new Scanner(System.in).nextLine();

        if(s1.compareTo(s2) > 0){
            System.out.println("s1 > s2");
        }else if(s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        }else {
            System.out.println("s1 = s2");
        }
    }
}
