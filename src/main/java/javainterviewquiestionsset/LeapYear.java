package javainterviewquiestionsset;

public class LeapYear {

    public static void main(String[] args) {

        // leap year : divisible by 4  for all the century years -- ending with 00
        // century year is a leap year when it's perfectly divisible by 400

        // 1900  is not a leap year
        // 2012 is a leap year

        int year = 2012;
        boolean leapYear = false;

        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;

            }
        }
            else{
                leapYear = false;
            }

        if(leapYear){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}
