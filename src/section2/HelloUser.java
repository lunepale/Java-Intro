package section2;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        var name = new Scanner(System.in).nextLine();
        var greetings = "Hello, " + name;
        System.out.println(greetings);
    }
}
