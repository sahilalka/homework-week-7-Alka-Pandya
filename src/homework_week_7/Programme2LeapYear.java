package homework_week_7;

import java.util.Scanner;

/**
 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?

 */
public class Programme2LeapYear {
            public static void leapYear(int year){
              if (year % 4 == 0){
                  System.out.println("It is a leap year");
              } else if (year % 100 == 0){
                  System.out.println("It is a leap year");
              } else if (year % 400 == 0){
                  System.out.println("It is a leap year");
              } else {
                  System.out.println("It is not a leap year");
              }


            }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        Programme2LeapYear.leapYear(year);
    }


}
