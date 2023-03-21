package homework_week_7;

/**  19.Write a Java program to calculate the average value of array elements.
 *
 */
public class Programme19AverageValue {

    public static void main(String[] args) {
        double[] values = {10, 20, 30, 40, 50};
        double total = 0;
        for (double element : values) {  // enhanced for loop
            total += element;
        }

        System.out.println(total);

        double average = 0;
        if (values.length > 0) {
            average = total / values.length;

        }
             System.out.println(average);

}




    }