package YKtasks;

import java.util.Scanner;

/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */
public class task12 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
String nameC = new Scanner(System.in).nextLine();
        userName(nameC);
        userSeat(nameC);


}


public static void userName(String name){
    if(name.equals("Alex") || name.equals("John") || name.equals("Stan")){
        System.out.println("Hello, "+name);
    } else {
        System.out.println("Tebya zdes ne jdut mr. "+name);
    }
        }
public static void userSeat(String name){
            if(name.equals("Alex") || name.equals("John") || name.equals("Stan")){
                int SeatNumber = getSeatNumber(name);
                System.out.println("Your seat is "+SeatNumber);
            }else {
                System.out.println("I mesta tebe toje net mr. "+name);
            }
        }
public static int getSeatNumber(String name){
switch (name){
    case "Alex":
        return 1;
    case "John":
        return 2;
    case "Stan":
        return 3;
        default:
            return -1;
}


    }


    }

