package homework_week_7;

import java.util.Scanner;

/** 5.WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 Print in following format
 _______________________________
 | Salary Slip |
 |______________________________|
 | Employee Id : 2564 |
 | Employee Name : Jay |
 |______________________________|
 | Basic Salary : 25000.0 |
 | HRA 10% : 2500.0 |
 | TA 8% : 2250.0 |
 | DA 9% : 2000.0 |
 | PF - 20& : 5000.0 |
 |______________________________|
 | Gross Salary : 26750.0 |
 |===============================
 */
public class Programme5Salary{
      public void Salary (int empID,String empName, double basicSalary) {
          double hra = 0.1 * basicSalary;
          double da = 0.08 * basicSalary;
          double ta = 0.09 * basicSalary;
          double pf = 0.2 * basicSalary;
          double grossSalary = basicSalary + hra + ta + da - pf;


          System.out.println("|------------------------------------|");
          System.out.println("|             Salary Slip            | ");
          System.out.println("|____________________________________|");
          System.out.println("| Employee ID :      "  + empID +   "            |");
          System.out.println("| Employee Name :  "  +  empName +  "               |");
          System.out.println("|___________________________________ |");
          System.out.println("| Basic Salary  :  "  + basicSalary +"           |");
          System.out.println("| HRA   10%  :    "  +   hra +      "             |");
          System.out.println("|   TA   8%   :    "   +  ta   +    "            |" );
          System.out.println("|  DA     9%  :   "    +   da  +     "            |");
          System.out.println("|  PF - 20%  :    "   +   pf    +    "            | ");
          System.out.println("|____________________________________  |");
          System.out.println("| Gross Salary   :  "  +   grossSalary +"        |");
          System.out.println("|=======================================|");


      }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID:  ");
        int empID = scanner.nextInt();

        System.out.println(" Enter Employee Name: ");
        String empName = scanner.next();

        System.out.println("Enter Basic Salary:  ");
        double basicSalary = scanner.nextDouble();

        Programme5Salary obj = new Programme5Salary();

    obj.Salary( empID,empName,basicSalary);
       scanner.close();

      }

}
