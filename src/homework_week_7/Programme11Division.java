package homework_week_7;

import java.util.Scanner;

/**
  11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
  and 5 separately.
  */
public class Programme11Division {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.println("Range of the number");
  int a = scanner.nextInt();

  System.out.println("Divided by : 3");
  for (int i = 1; i <= a; i++) {
   if (i % 3 == 0) System.out.print(i + ",");

  }
  System.out.println(" Divided by : 5");
  for (int i = 1; i <= a; i++) {
   if (i % 5 == 0) System.out.print(i + ",");
  }
  System.out.println("Divided by: 3 & 5");
  for (int i = 1;i<a;i++){
   if(i%3==0 &&i%5==0)System.out.print(i+",");
  }
    scanner.close();
 }
}