package homework_week_7;

import java.util.Scanner;

/**
 * 6.Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test  ");
        int num = scanner.nextInt();
        scanner.close();


        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + "  is odd");

        }
    }
}











