package section4;

import java.util.Scanner;

public class UniversalWeekDay {
    public static void main(String[] args) {
        System.out.println("Please enter your number(1-7): ");
        var day = new Scanner(System.in).nextInt();
        System.out.println("Is Monday first day of the week?(true/false)");
        boolean IsMondayFirst = new Scanner(System.in).nextBoolean();
        String result;

        if (IsMondayFirst) {
            if (day == 1) {
                result = "Monday";
            } else if (day == 2) {
                result = "Tuesday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 6) {
                result = "Saturday";
            } else if (day == 7) {
                result = "Sunday";
            } else {
                result = "Incorrect day entered: " + day;
            }
            System.out.println(result);
        } else {if (day == 1) {
            result = "Sunday";
        } else if (day == 2) {
            result = "Monday";
        } else if (day == 3) {
            result = "Tuesday";
        } else if (day == 4) {
            result = "Wednesday";
        } else if (day == 5) {
            result = "Thursday";
        } else if (day == 6) {
            result = "Friday";
        } else if (day == 7) {
            result = "Saturday";
        } else {
            result = "Incorrect day entered: " + day;
        }
            System.out.println(result);

        }


    }

}
