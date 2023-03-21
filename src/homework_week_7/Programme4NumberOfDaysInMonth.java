package homework_week_7;

/**
 *   4. Number of Days In Month
 */


public class Programme4NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == -0) {
                    if (year % 400 == 0) {
                        return true;

                    }
                } else {
                }
                return true;
            }
        }
        return false;
    }
    //......

    public static int getDaysInMonth(int month, int year) {
           if (month < 1 || month >  12 || year < 1 || year > 9999)
                   return  -1;
           switch (month){
               case 1:
                   return 31;
               case 2:
                   if ((year % 4 == 0)  && ((year % 100 ==- 0)) || (year % 400 == 0)){
                     return 29;

                   }else
                       return 28;
               case 3:
                   return 31;
               case 4:
                   return 30;
               case 5:
                   return 31;
               case 6:
                   return 30;
               case 7:
                   return 31;
               case 8:
                   return 31;
               case 9:
                   return 30;
               case 10:
                   return 31;
               case 11:
                   return 30;
               case 12:
                   return 31;
               default:
                   return -1;



           }
    }

                      public static void main(String[] args) {
                      System.out.println(isLeapYear(-1600));
                          System.out.println(isLeapYear(1600));
                          System.out.println(isLeapYear(2017));
                          System.out.println(isLeapYear(20000));
                          System.out.println(getDaysInMonth(1,2020));
                          System.out.println(getDaysInMonth(2,2020));
                          System.out.println(getDaysInMonth(2,2018));
                          System.out.println(getDaysInMonth(-1,2020));
                          System.out.println(getDaysInMonth(1,-2020));
    }


}




