package homework_week_7;

import java.util.Scanner;

/**13. Write a Java program which input any number between 1 to 7 and it print The Days
 name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days"
 */
public class Programme13Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number:");
        int day = in.nextInt();
        System.out.println(getDayName(day));

    }
       //get the name for the week
    public static String getDayName(int day) {
        String dayName = "days";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
            default:
                dayName = "Invalid day range";
        }

            return dayName;



        }


    }