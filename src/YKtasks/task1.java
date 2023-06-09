package absoft;
// import java.util.Scanner;

/*
Напишите программу в которой пользователь должен ввести с клавиатуры name и age

Выведите на экран 2 строки:
Hello (name)
Your age is (age)
 */

import java.util.Scanner;

public class task1 {

    public static void main (String [] args) {
        System.out.println("Please enter your name and age");
        var name= new Scanner(System.in).nextLine();
        var age = new Scanner(System.in).nextLine();


        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
    }
}


