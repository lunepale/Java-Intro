package YKtasks;
/*
Напишите программу в которой пользователь вводит свой возраст (соответствющее сообщение должно быть перед вводом)
и выводит одно из следующих сообщений:
Если возраст меньше 21 лет - вывести сообщение "Группа 1"
Если возраст от 21 до 40 лет (включительно) - вывести сообщение "Группа 2"
Если возраст больше 40 лет - вывести сообщение "Группа 3"
 */

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.print("Please enter your age ");
        int age = new Scanner(System.in).nextInt();
        String result;
        if (age < 21 && age >=0) {
            result = "Группа 1";
        } else if (age >= 21 && age <= 40) {
            result = "Группа 2";
        } else if (age < 0) {
            result = "Your age is invalid";
        } else {
            result = "Группа 3";
        }

        System.out.println(result);
    }
}
