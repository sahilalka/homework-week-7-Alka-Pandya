package homework_week_7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10Calculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the operator you want(+,-,*,/):");
        char operator = scanner.next().charAt(0);
            scanner.close();

        if (operator == '+'){
            System.out.println("Addition of"  +  num1  + "+" + num2 + " = "  +(num1+num2));
        } else if (operator == '-' ) {
            System.out.println("Subtraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (operator =='*') {
            System.out.println("Multiplication of " + num1 + "*" + num2 + " = " + (num1 * num2));
        } else if (operator =='/') {
            System.out.println("Division of " + num1 + " /" + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Operator is not available");

        }


    }


    }







