package homework_week_7;

import java.util.Scanner;

/** 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 then fined this sales
 Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2%
 */
public class Programme7Commission{
       double CommissionRate;

       public void CommissionRate(int salesID, String sellerName,double salesamount,double basicsalary){

           if (salesamount >= 50000){
               System.out.println("commissionRate is:  0.35");
           } else if (salesamount >= 30000) {
               System.out.println("commissionRate is:  0.20");
           } else if (salesamount >= 20000) {
               System.out.println("commissionRate is:  0.10");
           } else if (salesamount >= 10000) {
               System.out.println("commissionRate is:  0.05");
           }else {
               System.out.println("commissionRate is:  0.02");

           }

            double commission = salesamount * basicsalary;
            double grossSalary = basicsalary * commission;
       }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales ID");
        int salesID = scanner.nextInt();

        System.out.println("Enter seller's Name");
        String sellerName = scanner.next();

        System.out.println("Enter Sales Amount");
        double salesAmount = scanner.nextDouble();
        scanner.close();

    }

       }




