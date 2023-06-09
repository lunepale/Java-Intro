package YKtasks;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        System.out.print("Please enter your number from 1 to 20: ");
        int number = new Scanner(System.in).nextInt();


        if (number >= 1 && number <=20) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            } } else{
            System.out.println("Ошибка, введите число от 1 до 20");}
        }





        }


