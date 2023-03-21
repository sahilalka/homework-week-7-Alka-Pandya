package homework_week_7;

import java.util.Scanner;

/** 3.Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme3MarkSheet {
    static String result;
    static String grade;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String studentName = scanner.next();
        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter Maths Marks:  ");
        int maths = scanner.nextInt();
//        if ((maths > 0 || maths < 100) && (science > 0 || science < 100) && (english > 0 || english < 100)){
//            System.out.println("Marks is in 0 tp 100");
        System.out.println("Enter English Marks: ");
        int english = scanner.nextInt();
        System.out.println("Enter Science Marks: ");
        int science = scanner.nextInt();
        if ((maths > 0 || maths < 100) && (science > 0 || science < 100) && (english > 0 || english < 100)) {
            System.out.println("Marks is in 0 tp 100");

        } else {
            System.out.println(("Invalid Input,Marks should between 0 to 100"));
        }
        int totalOfSubject = maths + science + english;
        System.out.println(totalOfSubject);
        double per = ((totalOfSubject * 100) / 300);
        System.out.println(per);
        if (per >= 80) {
//            System.out.println("   A+");
            Programme3MarkSheet.result = "Pass";
            Programme3MarkSheet.grade = "A+";
        } else if (per >= 60) {
//            System.out.println("A");
            Programme3MarkSheet.result = "Pass";
            Programme3MarkSheet.grade = "A";
        } else if (per >= 50) {
//            System.out.println("B");
            Programme3MarkSheet.result = "Pass";
            Programme3MarkSheet.grade = "B";
        } else if (per >= 35) {
//            System.out.println("C");
            Programme3MarkSheet.result = "Pass";
            Programme3MarkSheet.grade = "C";
        }
        double result = totalOfSubject;
        System.out.println(totalOfSubject + " is" + result);
           scanner.close();

        System.out.println("|----------------------------------------------|");
        System.out.println("|                                              |");
        System.out.println("|              Mark Sheet                      |");
        System.out.println("|                                              |");
        System.out.println("|______________________________________________|");
        System.out.println("|          Name        : "  +   studentName  + "|");
        System.out.println("|          Roll No     :  "  +                 "|");
        System.out.println("|_______________________________________________|");
        System.out.println("|       Subject        :"   +                  "|");
        System.out.println("|______________________________________________|");
        System.out.println("|       Maths          : "   +                "|");
        System.out.println("|      Science         : "  +                 "|");
        System.out.println("|      English         : "    +               " |");
        System.out.println("|______________________________________________|");
        System.out.println("|       Total          :"   +                 "|");
        System.out.println("|        Percentage    :"     +               "|");
        System.out.println("|        Result        : "    +               "|");
        System.out.println("|         Grade       :  "  +                 "|");
        System.out.println("|______________________________________________|");

    }

}














































