package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scanner.nextInt();
        scanner.close();

        //ternary operator to check number
        String result = number %2==0 ? "Even"  :  "Odd";
        System.out.println(number  + "  is  "  + result);



    }




}
