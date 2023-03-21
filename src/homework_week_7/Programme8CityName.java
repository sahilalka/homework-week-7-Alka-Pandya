package homework_week_7;

import java.util.Scanner;

/** 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 */
public class Programme8CityName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        char ch = scanner.next().charAt(0);




        if (ch =='A'){
            System.out.println(" city name is America");

        } else if (ch == 'B') {
            System.out.println("city name is Barcelona");

        } else if (ch == 'C') {
            System.out.println("city name is Croatia");

        } else if (ch == 'D') {
            System.out.println("city name is Denmark");

        } else if (ch =='E') {
            System.out.println("city name is Edmonton");

        } else if (ch =='F') {
            System.out.println("city name is France");
        } else  {
            System.out.println("Invalid entry");
        }   scanner.close();

    }

    }














         








        

