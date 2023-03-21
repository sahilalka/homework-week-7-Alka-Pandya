package homework_week_7;

import java.util.Scanner;

/**16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”
 *
 */
public class Programme16Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = in.nextInt();




        if (n > 0) {
            System.out.println(("Number is positive"));

        } else if (n < 0) {
            System.out.println("Number is negative");

        }
          else
              System.out.println("Number is zero");
        }






    }
