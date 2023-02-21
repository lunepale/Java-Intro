package section4;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        //read
        System.out.println("Please enter a year");
        var year = new Scanner(System.in).nextInt();
//process
        String result;
        if ( year % 400 == 0) {
            result = "Eto visokosnyi god " + year;
        }
        else if (year % 100 == 0) {
            result = "Eto NE visokosnyi god " + year;
        } else if (year % 4 == 0) {
            result = "Eto visokosnyi god " + year;
        }        else {
            result = "Eto NE visokosnyi god "+year;
        }
        //display
        System.out.println(result);
    }
}
