package section4;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Please enter your number(1-7): ");
        var day = new Scanner(System.in).nextInt();
        String result;
        if (day == 1)
        {
            result ="Monday";
        }
        else if (day == 2)
        {
            result ="Tuesday";
        }
        else if (day == 3)
        {
            result ="Wednesday";
        }
        else if (day == 4)
        {
            result ="Thursday";
        } else if (day == 5)
        {
            result ="Friday";
        } else if (day == 6)
        {
            result ="Saturday";
        } else if (day == 7)
        {
            result ="Sunday";
        } else
        {
            result = "There is no such day in a week " + day;
        }

            System.out.println(result);
        }


    }

