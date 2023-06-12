package YKtasks;

import java.util.Scanner;

/*
Напишите программу в которой:
1) Пользователь должен ввести product name, price и qty для 5 продуктов
2) Программа должна посчитать total = price * qty для каждого продукта
3) Программа должна вывести в консоль product name и total по каждому продукта (пример Phone | 120.0)

Note1: price может быть как целым так и дробным числом
Note2: price и qty не могут быть равны "0" (вывести ошибку и прервать программу)
Note3: класс откуда будет раниться тест, должен содержать в себе ТОЛЬКО ВЫЗОВ МЕТОДОВ (допускается создание переменных)
Сами методы должны лежать в отдельном классе и вызываться из него.
 */
public class task13 {
    public static void main(String[] args) {
        String[] productName = new String[5];
        double[] productPrice = new double[5];
        int[] productQuantity = new int[5];

      /*  for (int i = 0; i < 5; i++) {

            System.out.println("Enter product name: ");
            productName[i] = new Scanner(System.in).nextLine();
            System.out.println("Enter product price: ");
            productPrice[i] = new Scanner(System.in).nextDouble();
            System.out.println("Enter product quantity: ");
            productQuantity[i] = new Scanner(System.in).nextInt();
        }*/

        readInput(productName, productQuantity, productPrice);
        calculate(productQuantity, productPrice, productName);
    }

public static void readInput(String[] productName, int[] productQuantity, double[] productPrice) {
Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++){
        System.out.println("Enter product name: ");
    productName[i] = new Scanner(System.in).nextLine();
    System.out.println("Enter product price: ");
    productPrice[i] = new Scanner(System.in).nextDouble();
    System.out.println("Enter product quantity: ");
    productQuantity[i] = new Scanner(System.in).nextInt();}
}




        public static void calculate (int[] productQuantity, double[] productPrice, String[] productName) {
        for (int i = 0; i < 5; i++) {


            if (productPrice[i] <= 0 || productQuantity[i] <= 0) {

                System.out.println("Price/quantity cannot be lower 0");
                return;
            }

              double total = productQuantity[i] * productPrice[i];
              System.out.println(productName[i] +" | "+total);
          }}
        }







