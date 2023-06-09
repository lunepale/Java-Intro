package YKtasks;

import java.util.Scanner;

/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */
public class task11 {
    public static void main(String[] args) {
        System.out.println("Enter your quantity");
        int quantity = new Scanner(System.in).nextInt();
        System.out.println("Enter your price");
        double price = new Scanner(System.in).nextDouble();
        calculation(quantity, price);
    }
    public static void calculation(int quantity, double price) {
            double total = price * quantity * 0.8;
            System.out.println("Your total= "+total);
        }


    }

