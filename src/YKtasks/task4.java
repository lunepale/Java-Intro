package YKtasks;

import java.util.Scanner;

/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию switch - case
 */
public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите своё число (1-7): ");
        var day = new Scanner(System.in).nextInt();

        switch (day) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6: {
                System.out.println("Суббота");
                break;
            } case 7:{
                System.out.println("Воскресенье");
            }
            default: {
                System.out.println("Ошибка, введите число от 1 до 7");
            }
        }
    }
}
