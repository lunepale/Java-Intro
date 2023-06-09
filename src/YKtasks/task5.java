package YKtasks;

import java.util.Scanner;

/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */
public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите своё число (1-7): ");
        var day = new Scanner(System.in).nextInt();
        String result;
        if (day == 1)
        {
            result ="Понедельник";
        }
        else if (day == 2)
        {
            result ="Вторник";
        }
        else if (day == 3)
        {
            result ="Среда";
        }
        else if (day == 4)
        {
            result ="Четверг";
        } else if (day == 5)
        {
            result ="Пятница";
        } else if (day == 6)
        {
            result ="Суббота";
        } else if (day == 7)
        {
            result ="Воскресенье";
        } else
        {
            result = "Ошибка, введите число от 1 до 7 ";
        }

        System.out.println(result);
    }


}