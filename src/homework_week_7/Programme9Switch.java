package homework_week_7;

import java.util.Scanner;

/**  9.program-8 using switch statement.
 */
public class Programme9Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any  alphabet from A TO F");
        char ch = scanner.next().charAt(0);
        scanner.close();

        switch (ch){

            case ('A'):
                System.out.println("city name is America");
                break;
            case ('B'):
                System.out.println("city name is Barcelona");
                break;
            case ('C'):
                System.out.println("city name is Croatia");
                break;
            case ('D'):
                System.out.println("city name is Denmark");
                break;
            case ('E'):
                System.out.println("city name is Edmonton");
                break;
            case ('F'):
                System.out.println("city name is France");
                break;
            default:
                System.out.println("Invalid entry");





        }

        }


    }





