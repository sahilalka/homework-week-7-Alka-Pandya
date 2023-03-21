package homework_week_7;

import java.util.Scanner;

/**12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12InputValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character : ");
        ch=scanner.next().charAt(0);
        System.out.println( ch>='a'&&ch<='z'?"small case alphabet"
                :ch>='A'&&ch<='Z'?"Capital Alphabet"
                :ch>='0'&&ch<='9'?"number"
                :"symbol");
        scanner.close();



    }




}
