package YKtasks;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */
public class task2 {

    public static void main(String[] args) {
        System.out.print("Enter your price: ");
        double price = new Scanner(System.in).nextDouble();
        System.out.print("Enter your quantity: ");
        int quantity = new Scanner(System.in).nextInt();

        double result = price * quantity;

        System.out.println("Total: "+result);
    }
}
