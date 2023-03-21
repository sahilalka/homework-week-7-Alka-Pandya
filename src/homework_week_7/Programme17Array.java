package homework_week_7;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme17Array {
    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,4};
        String[] strings = {"red","pink","yellow","green","white","silver"};

       //sorting the numeric array
        Arrays.sort(num);
         System.out.println("sorted numbers:  "   +  Arrays.toString(num));

        //sorting the string array
        Arrays.sort(strings);
        System.out.println("sorted strings:   "  +   Arrays.toString(strings));

    }










}
