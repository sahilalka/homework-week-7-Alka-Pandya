package homework_week_7;
/**20. Write a Java program to test if an array contains a specific value
 *
 */
public class Programme20SpecificValue{
     public static boolean contains(int[]  arr, int item) {
      for (int n : arr) {
       if (item == n) {
        return true;
       }
      }
      return false;
     }



 public static void main(String[] args) {
  int[] my_array1 = {175,125,80,90,55,87,20,37};

  System.out.println(contains(my_array1,125));
  System.out.println(contains(my_array1,87));


 }

}

